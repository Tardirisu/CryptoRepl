package com.example.cryptorepl.services;

import org.springframework.stereotype.Service;

@Service("Caesar")
public class CaesarCipherService implements CryptoAlgorithm {

    @Override
    public boolean isValidKey(String key) {
        try {
            Integer.parseInt(key); // Check if key is numeric
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String encrypt(String plainText, String key) {
        int shift= Integer.parseInt(key); // Convert key to integer

        StringBuilder cipherText = new StringBuilder();
        shift = shift % 26 + 26; // Ensure shift is positive
        for (char c : plainText.toCharArray()) {
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
        return encrypt(cipherText, String.valueOf(-Integer.parseInt(key))); // Reverse the shift
    }

}
