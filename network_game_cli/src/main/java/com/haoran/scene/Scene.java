package com.haoran.scene;

import com.google.common.collect.Lists;
import com.haoran.spirit.Spirit;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.List;

public abstract class Scene {

    public List<Spirit> spiritList = Lists.newArrayList();

    public void into() {}

    public void update(int dt) {
        for (Spirit spirit : spiritList) {
            spirit.update(dt);
        }
    }

    public void draw(Graphics g) {
        for (Spirit spirit : spiritList) {
            spirit.draw(g);
        }
    }

}
