package com.danny.Spirte.RedSeaViewSprite;

import com.danny.Spirte.Sprite;

import javax.swing.*;

public class Pharoah extends Sprite {

    public Pharoah(int x, int y){
        setPosition(x, y);
        img = new ImageIcon("pharaoh.png");
    }




    @Override
    public String overlap(int x, int y) {
        return null;
    }
}
