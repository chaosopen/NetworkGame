package com.haoran.spirit;

import com.haoran.component.ImagePreview;
import javafx.util.Pair;
import lombok.Data;

import java.awt.*;

@Data
public abstract class Spirit {

    protected int x;

    protected int y;

    protected int w;

    protected int h;

    protected ImagePreview imagePreview = new ImagePreview();

    protected Pair<Integer, Integer> speed = new Pair(0, 0);

    protected Image image;

    public void update(int dt){
        x = speed.getKey() * dt;
        y = speed.getValue() * dt;
        image = imagePreview.getImage();
    }

    public void draw(Graphics g) {
        g.drawImage(image, x, y, w, h, null);
    }
}
