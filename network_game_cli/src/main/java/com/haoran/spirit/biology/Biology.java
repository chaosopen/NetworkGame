package com.haoran.spirit.biology;

import com.google.common.collect.Lists;
import com.haoran.ResourcesImages;
import com.haoran.spirit.Spirit;

import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.util.Timer;

/**
 * 生物
 */
public class Biology extends Spirit {

    static Timer timer = new Timer();

    List<Spirit> children = Lists.newArrayList();

    public Biology() {
        h = 500;
        w = 500;
        imagePreview.setSpeed(900);
        for (int i = 13; i < 23; i++) {
            Image image = ResourcesImages.imageMap.get("frame_" + i);
            imagePreview.getPreviews().add(image);
        }
//        image = ResourcesImages.imageMap.get("demo");
    }


    public void draw(Graphics g) {
        super.draw(g);
        for (Spirit child : children) {
            child.draw(g);
        }
    }
}
