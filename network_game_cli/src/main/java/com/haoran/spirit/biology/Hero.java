package com.haoran.spirit.biology;

import com.haoran.ResourcesImages;
import com.haoran.spirit.Spirit;
import javafx.util.Pair;

import java.awt.Graphics;
import java.awt.Image;

/**
 * 英雄
 */
public class Hero extends Biology {

    public Hero() {
        h = 500;
        w = 500;
        bodyX = 226;
        bodyY = 350;
        bodyW = 35;
        bodyH = 33;
        speed = new Pair(100, 100);
        imagePreview.setSpeed(900);
        for (int i = 13; i < 23; i++) {
            Image image = ResourcesImages.imageMap.get("frame_" + i);
            imagePreview.getPreviews().add(image);
        }
    }

    @Override
    public void update(int dt) {
        super.update(dt);
    }

    public void draw(Graphics g) {
        super.draw(g);
        for (Spirit child : children) {
            child.draw(g);
        }
    }
}
