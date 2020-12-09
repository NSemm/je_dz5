package com.k7.crypters;

import lombok.Data;

@Data
public class CesarSymbolCrypter implements SymbolCrypter {
    private String cipher = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz.,?!:;1234567890+-=";
    private int key = 3;

    @Override
    public char crypt(char c) {
        int cipherIndex = cipher.indexOf(c) + key;
        if (cipherIndex > cipher.length() - 1) c = cipher.charAt(cipherIndex - cipher.length());
        else c = cipher.charAt(cipherIndex);
        return c;

    }

    @Override
    public char uncrypt(char c) {
        int cipherIndex = cipher.indexOf(c) - key;
        if (cipherIndex < 0) c = cipher.charAt(cipher.length() + cipherIndex);
        else c = cipher.charAt(cipherIndex);
        return c;

    }
}
