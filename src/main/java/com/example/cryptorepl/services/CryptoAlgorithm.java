package com.example.cryptorepl.services;

public interface CryptoAlgorithm {
    /**
     * Encrypts the given plain text using the specified key.
     *
     * @param plainText the text to be encrypted
     * @param key the key used for encryption (can be a number, string, etc.)
     * @return the encrypted text
     */
    String encrypt(String plainText, String key);

    /**
     * Decrypts the given cipher text using the specified key.
     *
     * @param cipherText the text to be decrypted
     * @param key the key used for decryption (can be a number, string, etc.)
     * @return the decrypted text
     */
    String decrypt(String cipherText, String key);

    /**
     * Validate the key of corresponding algorithm
     *
     * @param key the key checked by the method
     * @return true if the key is valid for the corresponding algorithm
     */
    boolean isValidKey(String key);
}
