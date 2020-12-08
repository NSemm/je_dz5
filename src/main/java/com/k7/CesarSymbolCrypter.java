package com.k7;

public class CesarSymbolCrypter implements SymbolCrypter {
    private String CIPHER = "abcdefghijklmnopqrstuvwxyz";
    private int KEY = 3;

    @Override
    public char crypt(char c) {
        if (c == ' ') return c;
        else {
            int cipherIndex = CIPHER.indexOf(c) + KEY;
            if (cipherIndex > CIPHER.length() - 1) c = CIPHER.charAt(cipherIndex - CIPHER.length());
            else c = CIPHER.charAt(cipherIndex);
            return c;
        }
    }

    @Override
    public char uncrypt(char c) {
        if (c == ' ') return c;
        else {
            int cipherIndex = CIPHER.indexOf(c) - KEY;
            if (cipherIndex < 0) c = CIPHER.charAt(CIPHER.length() + cipherIndex);
            else c = CIPHER.charAt(cipherIndex);
            return c;
        }
    }
}


//    static String cesarCrypt(String s, int key) {
//        String cryptAlphabet = "abcdefghijklmnopqrstuvwxyz";
//        char[] temp = s.toCharArray();
//        for (int i = 0; i < temp.length; i++) {
//            char element = s.toLowerCase().charAt(i);
//            if (element == ' ') {
//                temp[i] = ' ';
//                continue;
//            }
//            int alphabetIndex = cryptAlphabet.indexOf(element) + key;
//            if (alphabetIndex > cryptAlphabet.length() - 1)
//                temp[i] = cryptAlphabet.charAt(alphabetIndex - cryptAlphabet.length());
//            else temp[i] = cryptAlphabet.charAt(alphabetIndex);
//        }
//        return String.copyValueOf(temp);
//    }