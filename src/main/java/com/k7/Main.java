package com.k7;

public class Main {
    public static void main(String[] args) {
SymbolCrypter symbolCrypter = new CesarSymbolCrypter();
        System.out.println(symbolCrypter.uncrypt(symbolCrypter.crypt(' ')));
    }
}
