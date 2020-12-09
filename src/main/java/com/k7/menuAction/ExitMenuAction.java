package com.k7.menuAction;

import java.util.SortedMap;

public class ExitMenuAction implements MenuAction {
    @Override
    public void doAction() {
        System.out.println("Selected " + getName() + " action.\nGood bye!");
    }

    @Override
    public String getName() {
        return "Exit";
    }

    @Override
    public boolean closeAfter() {
        return true;
    }
}
