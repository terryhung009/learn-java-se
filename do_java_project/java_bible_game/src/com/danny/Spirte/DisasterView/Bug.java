package com.danny.Spirte.DisasterView;

import com.danny.Spirte.Sprite;

import javax.swing.*;

public class Bug extends Sprite {

    public Bug(int x, int y){
        setPosition(x, y);
        img = new ImageIcon("bug.png");
    }



    @Override
    public String overlap(int x, int y) {
        return null;
    }
}
