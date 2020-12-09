package com.k7.menuAction;

import com.k7.StringCrypter;
import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class XorCryptMenuAction implements MenuAction {
    private Scanner sc;
    private StringCrypter stringCrypter;

    @Override
    public void doAction() {
        System.out.println("Enter text to encrypt");
        String text = sc.nextLine();
        System.out.println("----------" + getName() + "----------");
        System.out.println(stringCrypter.crypt(text));
        System.out.println("---------------------------------");
    }

    @Override
    public String getName() {
        return "Crypt by XOR cipher";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
