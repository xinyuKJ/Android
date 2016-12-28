package com.example.shejimoshi;

/**
 * Created by dzf on 16/12/8.
 */
//具体的Builder类
public class MacbookBuilder extends Builder {
    private Computer computer = new MacBook();

    @Override
    public void builcBoard(String board) {
        computer.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        computer.setmDisplay(display);
    }

    @Override
    public void buildOS() {
        computer.setmOS();
    }

    @Override
    public Computer create() {
        return computer;
    }
}
