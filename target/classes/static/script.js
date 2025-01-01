function onAlgorithmChange() {
    const algorithm = document.getElementById("algorithm").value;
    const keyInput = document.getElementById("key");

    // Adjust placeholder text based on selected algorithm
    if (algorithm === "Caesar") {
        keyInput.placeholder = "Enter numeric key (e.g., 3)";
    } else if (algorithm === "MonoSub") {
        keyInput.placeholder = "Enter string key (e.g., XEUADNBKVMROCQFSYHWGLZIJPT)";
    } else if (algorithm === "Vigenere") {
        keyInput.placeholder = "Enter string key (e.g., SECRET)";
    }
}

async function performOperation(operation) {
    const text = document.getElementById("text").value;
    const algorithm = document.getElementById("algorithm").value;
    const key = document.getElementById("key").value;

    if (!text || !algorithm || !key) {
        alert("Please fill in all fields!");
        return;
    }

    try {
        const response = await fetch(`http://localhost:8080/api/crypto/${operation}`, {
            method: "POST",
            headers: {
                "Content-Type": "application/x-www-form-urlencoded",
            },
            body: new URLSearchParams({
                text: text,
                key: key,
                algorithm: algorithm,
            }),
        });

        if (response.ok) {
            const result = await response.text();
            document.getElementById("result").innerText = `${result}`;
        } else {
            document.getElementById("result").innerText = "Error: Something went wrong!";
        }
    } catch (error) {
        document.getElementById("result").innerText = `Error: ${error.message}`;
    }
}