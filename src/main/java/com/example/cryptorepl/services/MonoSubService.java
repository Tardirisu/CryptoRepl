package com.example.cryptorepl.services;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("MonoSub")
public class MonoSubService implements CryptoAlgorithm {

    public boolean isValidKey(String key) {
        // Check length
        if (key.length() != 26) {
            System.out.println("Key must be exactly 26 characters long.");
            return false;
        }

        // Check for duplicates
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : key.toCharArray()) {
            if (uniqueChars.contains(c)) {
                System.out.println("Key contains duplicate characters.");
                return false;
            }
            uniqueChars.add(c);
        }

        // Check for allowed characters
        for (char c : key.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                System.out.println("Key contains invalid characters. Only letters are allowed.");
                return false;
            }
        }

        // If all checks pass
        return true;
    }


    @Override
    public String encrypt(String plainText, String key) {
        int[] map = new int[26];
        for (int i = 0; i < 26; i++){
            char c = key.toCharArray()[i];
            if (Character.isUpperCase(c)) {
                map[i] = (int) ((c - 'A') % 26);
            } else {
                map[i] = (int) ((c - 'a') % 26);
            }
        }

        StringBuilder cipherText = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            if (Character.isLetter(c)) {
                int shift;
                if (Character.isUpperCase(c)) {
                    shift = map[(c - 'A'+ 26) % 26];
                    cipherText.append((char) ('A' + shift));
                } else {
                    shift = map[(c - 'a'+ 26) % 26];
                    cipherText.append((char) ('a' + shift));
                }
            } else {
                cipherText.append(c);
            }
        }
        return cipherText.toString();
    }

    @Override
    public String decrypt(String cipherText, String key) {
        char[] charArray = new char[26];
        for (int i = 0; i < 26; i++){
            char c = key.toCharArray()[i];
            int value;
            if (Character.isUpperCase(c)) {
                value = (int) ((c - 'A' + 26) % 26);
                charArray[value] = ((char) ('A' + i));
            } else {
                value = (int) ((c - 'a' + 26) % 26);
                charArray[value] = ((char) ('a' + i));
            }
        }
        String reverseKey = new String(charArray);
        return encrypt(cipherText, reverseKey);
    }

}
