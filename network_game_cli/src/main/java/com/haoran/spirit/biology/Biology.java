package com.haoran.spirit.biology;

import com.haoran.ResourcesImages;
import com.haoran.spirit.Spirit;
import javafx.util.Pair;

import java.awt.Graphics;
import java.awt.Image;

/**
 * 生物
 */
public class Biology extends Spirit {

    private Image image;

    public Biology() {
        image = ResourcesImages.imageMap.get("demo");
    }

    //速度
    public Pair<Integer, Integer> speed = new Pair(0, 0);

    public void update(int dt) {
        x = speed.getKey() * dt;
        y = speed.getValue() * dt;
    }

    public void draw(Graphics g) {
        g.drawImage(image, x, y, w, h, null);
    }
}
