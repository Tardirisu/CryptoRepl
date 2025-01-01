package com.example.cryptorepl.services;

import org.springframework.stereotype.Service;

@Service("Vigenere")
public class VigenereCipherService implements CryptoAlgorithm {

    @Override
    public boolean isValidKey(String key) {
        if (key == null || key.isEmpty()) {
            return false;
        }
        for (char c : key.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String encrypt(String plainText, String key) {

        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.toCharArray()[i];
            char k  = key.charAt(i % key.length());
            int shift;
            if (Character.isUpperCase(k)) {
                shift = (k - 'A') % 26;
            } else {
                shift = (k - 'a') % 26;
            }
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    cipherText.append((char) ('A' + (c - 'A' + shift) % 26));
                } else {
                    cipherText.append((char) ('a' + (c - 'a' + shift) % 26));
                }
            } else {
                cipherText.append(c);
            }
        }

        return cipherText.toString();
    }

    @Override
    public String decrypt(String cipherText, String key) {

        StringBuilder plainText = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            char c = cipherText.toCharArray()[i];
            char k  = key.charAt(i % key.length());
            int shift;
            if (Character.isUpperCase(k)) {
                shift = (k - 'A') % 26;
            } else {
                shift = (k - 'a') % 26;
            }
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    plainText.append((char) ('A' + (c - 'A' - shift + 26) % 26));
                } else {
                    plainText.append((char) ('a' + (c - 'a' - shift + 26) % 26));
                }
            } else {
                plainText.append(c);
            }
        }

        return plainText.toString();
    }

}
