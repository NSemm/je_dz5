package com.k7.menuAction;

import com.k7.StringCrypter;
import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class XorUncryptMenuAction implements MenuAction {
    private Scanner sc;
    private StringCrypter stringCrypter;

    @Override
    public void doAction() {
        System.out.println("Enter text to decrypt");
        String text = sc.nextLine();
        System.out.println("----------" + getName() + "----------");
        System.out.println(stringCrypter.uncrypt(text));
        System.out.println("---------------------------------");
    }

    @Override
    public String getName() {
        return "Decrypt by XOR cipher";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
