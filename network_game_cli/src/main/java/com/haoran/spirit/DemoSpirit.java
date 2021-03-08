package com.haoran.spirit;

import javax.swing.*;
import java.awt.*;

import static com.haoran.Constants.positionUrl;

public class DemoSpirit extends Spirit {

    public void update(int dt) {
        x += 1;

    }

    public void draw(Graphics g) {
        w = 50;
        h = 50;
        Image image = new ImageIcon(positionUrl + "1.png").getImage();
        g.drawImage(image, x, y, w, h, null);

    }
}
