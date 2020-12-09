package com.k7;

import com.k7.crypters.CesarSymbolCrypter;
import com.k7.crypters.SymbolCrypter;
import com.k7.crypters.XorSymbolCrypter;
import com.k7.menuAction.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        SymbolCrypter cesarSymbolCrypter = new CesarSymbolCrypter();
        SymbolCrypter xorSymbolCrypter = new XorSymbolCrypter();
        StringCrypter stringCrypterXor = new StringCrypter(xorSymbolCrypter);
        StringCrypter stringCrypterCesar = new StringCrypter(cesarSymbolCrypter);
        menu.addAction(new CesarCryptMenuAction(sc, stringCrypterCesar));
        menu.addAction(new CesarUncryptMenuAction(sc, stringCrypterCesar));
        menu.addAction(new XorCryptMenuAction(sc, stringCrypterXor));
        menu.addAction(new XorUncryptMenuAction(sc, stringCrypterXor));
        menu.addAction(new ExitMenuAction());
        menu.run(sc);
    }
}
