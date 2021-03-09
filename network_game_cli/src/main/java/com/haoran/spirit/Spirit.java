package com.haoran.spirit;

import com.haoran.Constants;
import com.haoran.component.ImagePreview;
import javafx.util.Pair;
import lombok.Data;

import java.awt.*;

@Data
public abstract class Spirit {

    public int directX = 1;

    public int directY = 1;

    protected int x;

    protected int y;

    protected int w;

    protected int h;

    protected int bodyX;

    protected int bodyY;

    protected int bodyW;

    protected int bodyH;

    protected ImagePreview imagePreview = new ImagePreview();

    protected Pair<Integer, Integer> speed = new Pair(0, 0);

    protected Image image;

    public void update(int dt){
        x += speed.getKey() * (((double) dt) / 1000) * directX;
        y += speed.getValue() * (((double) dt) / 1000) * directY;
        System.out.println(speed.getValue()*(((double) dt) / 1000) * directY);
        image = imagePreview.getImage();
    }

    public void draw(Graphics g) {
        g.drawImage(image, x, y, w, h, null);
        if (Constants.DEBUG) {
            g.setColor(Color.RED);
            g.drawRect(x + bodyX, y + bodyY, bodyW, bodyH);
        }
    }
}
