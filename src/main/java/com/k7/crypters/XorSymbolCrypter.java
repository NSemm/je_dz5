package com.k7.crypters;

import lombok.Data;

@Data
public class XorSymbolCrypter implements SymbolCrypter {
    private int key = 18;

    @Override
    public char crypt(char c) {
        if (c == ' ') return c;
        else {
            int rez = (int) c ^ key;
            return (char) rez;
        }
    }

    @Override
    public char uncrypt(char c) {
        if (c == ' ') return c;
        else {
            int rez = (int) c ^ key;
            return (char) rez;
        }
    }
}
