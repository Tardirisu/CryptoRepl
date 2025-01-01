
# CryptoRepl

### English Version

**CryptoRepl** is a Java-based cryptography project inspired by the classical and modern encryption algorithms covered in the textbook *Introduction to Modern Cryptography*. It aims to provide a hands-on approach for learning and understanding cryptographic principles.

🔨 The project is still under development 🔨

---

## Completed Features

### **Classical Ciphers from Chapter 1**

1. **Caesar Cipher**
   - A simple substitution cipher that shifts characters based on an integer key.
2. **Vigenère Cipher**
   - A polyalphabetic substitution cipher using a repeating key.
3. **Monoalphabetic Substitution Cipher**
   - A direct mapping of the alphabet to another ordered sequence of characters.

---

## Planned Features - Tentative

### **Symmetric Key Encryption**

- **DES (Data Encryption Standard)**
- **AES (Advanced Encryption Standard)**
- **RC4 Stream Cipher**
- **Block Cipher Modes**: e.g., CBC, CTR.

### **Hash Functions**

- MD5, SHA-1, SHA-256.

### **Public-Key Encryption**

- RSA encryption, Diffie-Hellman key exchange.

### **Digital Signatures**

- RSA signatures, DSA, ECDSA.

🔨 Additional chapters and notes may be added in the future 🔨

---

## How to Run Locally

### Prerequisites

- **JDK**: Version 21 or higher.
- **Maven**: Version 3.8 or higher.
- **Browser**: Any modern browser supporting HTML5.

### Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/CryptoRepl.git
   cd CryptoRepl
   ```

2. Install dependencies using Maven:
   ```bash
   mvn install
   ```

3. Start the backend service:
   ```bash
   mvn spring-boot:run
   ```

4. Access the frontend:

   After starting the backend, open your browser and navigate to:
   ```plaintext
   http://localhost:8080
   ```
   Enter plaintext/ciphertext, the key, select an algorithm, and click the encrypt or decrypt button to see the results.

---

## Project Structure

```plaintext
CryptoRepl/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/cryptorepl/
│   │   │       ├── controllers/
│   │   │       │   └── CryptoController.java
│   │   │       ├── algorithms/
│   │   │       │   ├── CaesarCipher.java
│   │   │       │   ├── VigenereCipher.java
│   │   │       │   └── MonoalphabeticCipher.java
│   │   │       └── CryptoReplApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── index.html
│   │       │   ├── style.css
│   │       │   └── script.js
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/example/cryptorepl/
├── pom.xml
└── README.md
```

---

## Contribution Guidelines

We welcome suggestions and contributions to improve this project! Please feel free to submit a Pull Request or report issues.  
Contribution process:

1. Fork this repository.
2. Create a feature branch:
    ```bash
    git checkout -b feature/YourFeature
    ```
3. Commit your changes and push:
    ```bash
    git push origin feature/YourFeature
    ```
4. Open a Pull Request.

---

## License

CryptoRepl is open-sourced under the MIT License.

---

## Author

The project is created by **Tardirisu**.

Feel free to visit my GitHub profile!


---

---

# CryptoRepl

### 中文版说明

**CryptoRepl** 是一个用 Java 编写的密码学项目，旨在复刻密码学课程经典教材 *Introduction to Modern
Cryptography* 中的古典和现代加密算法，为学习和理解密码学原理提供实践支持。

🔨目前还在施工中🔨


---

## 已完成的功能

### **古典密码 from Chapter 1**

1. **凯撒密码 (Caesar Cipher)**
    - 简单的移位加密，通过整数密钥控制字符的偏移量。
2. **维吉尼亚密码 (Vigenère Cipher)**
    - 使用多表替换的方式加密。
3. **单表替换密码 (Monoalphabetic Substitution Cipher)**
    - 字母表直接映射到另一个字母表。

---

## 计划中的功能 - 暂定

### **对称加密 (Symmetric Key Encryption)**

- **DES (Data Encryption Standard)**
- **AES (Advanced Encryption Standard)**
- **RC4 流密码**
- **块密码模式 (Block Cipher Modes)**：如 CBC、CTR。

### **哈希函数 (Hash Functions)**

- MD5、SHA-1、SHA-256。

### **公钥加密 (Public-Key Encryption)**

- RSA 加密、Diffie-Hellman 密钥交换。

### **数字签名 (Digital Signatures)**

- RSA 签名、DSA、ECDSA。

🔨后续可能还会看情况补充章节笔记🔨

---

## 本地运行方法

### 环境要求

- **JDK**：版本 21 或更高。
- **Maven**：版本 3.8 或更高。
- **浏览器**：任意支持 HTML5 的现代浏览器。

### 运行步骤

1. 克隆项目代码：
   ```bash
   git clone https://github.com/yourusername/CryptoRepl.git
   cd CryptoRepl

2. 使用 Maven 安装依赖：
    ```bash
    mvn install

3. 启动后端服务：
    ```bash
    mvn spring-boot:run

4. 访问前端:

   启动后端后，打开浏览器访问：
   ```plaintext
   http://localhost:8080
   ```
   输入明文/密文、密钥，选择算法，点击加密或解密按钮，查看结果。

---

## 项目结构

    ```plaintext
    CryptoRepl/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/example/cryptorepl/
    │   │   │       ├── controllers/
    │   │   │       │   └── CryptoController.java
    │   │   │       ├── algorithms/
    │   │   │       │   ├── CaesarCipher.java
    │   │   │       │   ├── VigenereCipher.java
    │   │   │       │   └── MonoalphabeticCipher.java
    │   │   │       └── CryptoReplApplication.java
    │   │   └── resources/
    │   │       ├── static/
    │   │       │   ├── index.html
    │   │       │   ├── style.css
    │   │       │   └── script.js
    │   │       └── application.properties
    │   └── test/
    │       └── java/
    │           └── com/example/cryptorepl/
    ├── pom.xml
    └── README.md


---

## 贡献指南

欢迎对项目的改进提出建议或贡献代码！请提交 Pull Request 或报告问题。
贡献流程：

1. Fork 此仓库。
2. 创建功能分支：
    ```bash
    git checkout -b feature/YourFeature
3. 提交更改并推送：
    ```bash
    git push origin feature/YourFeature
4. 创建 Pull Request。


---
## 开源协议
CryptoRepl 项目基于 MIT License 开源。

---
## 作者

本项目的作者是**Tardirisu**

欢迎访问我的 GitHub！