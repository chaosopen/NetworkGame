package com.haoran.spirit.biology;

import com.google.common.collect.Lists;
import com.haoran.ResourcesImages;
import com.haoran.spirit.Spirit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.util.Timer;

/**
 * 生物
 */
public class Biology extends Spirit {

    List<Spirit> children = Lists.newArrayList();

    public Biology() {
    }


    public void draw(Graphics g) {
        super.draw(g);
        for (Spirit child : children) {
            child.draw(g);
        }
    }
}
