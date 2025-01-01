package com.example.cryptorepl.controllers;

import com.example.cryptorepl.services.CryptoAlgorithm;
import jakarta.el.BeanNameResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/crypto")
public class CryptoController {

    @Autowired
    private ApplicationContext context;

    @PostMapping("/{operation}")
    public String processRequest(
            @PathVariable String operation,  // Path variable: "encrypt" or "decrypt"
            @RequestParam String text,       // Text to encrypt/decrypt
            @RequestParam String key,        // Key (string)
            @RequestParam String algorithm   // Algorithm name (e.g., "Caesar")
    ) {
        CryptoAlgorithm cryptoService = (CryptoAlgorithm) context.getBean(algorithm, CryptoAlgorithm.class);

        // Validate the key
        if (!cryptoService.isValidKey(key)) {
            throw new IllegalArgumentException("Invalid key for " + algorithm + " algorithm.");
        }

        // Perform the operation
        if (operation.equalsIgnoreCase("encrypt")) {
            return cryptoService.encrypt(text, key);
        } else if (operation.equalsIgnoreCase("decrypt")) {
            return cryptoService.decrypt(text, key);
        } else {
            throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}

