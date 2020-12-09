package com.k7;

import com.k7.crypters.SymbolCrypter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StringCrypter {
    private SymbolCrypter symbolCrypter;

    public String crypt(String string) {
        char[] temp = string.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            temp[i] = symbolCrypter.crypt(temp[i]);
        }
        return String.copyValueOf(temp);
    }

    public String uncrypt(String string) {
        char[] temp = string.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            temp[i] = symbolCrypter.uncrypt(temp[i]);
        }
        return String.copyValueOf(temp);
    }
}
