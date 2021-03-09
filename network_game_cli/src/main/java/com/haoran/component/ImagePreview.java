package com.haoran.component;

import com.google.common.collect.Lists;
import lombok.Data;

import java.awt.Image;
import java.util.List;

@Data
public class ImagePreview {

    private List<Image> previews = Lists.newArrayList();

    private long index = 0;

    private int speed;

    public void setSpeed(int speed) {
        if (speed >= 1000) {
            speed = 999;
        } else {
            this.speed = speed;
        }
    }

    private long time = System.currentTimeMillis();

    public Image getImage() {
        long currentTime = System.currentTimeMillis();
        long interval = currentTime - time;
        long value = interval / (1000 - speed);
        if (value > 0) {
            time = currentTime;
            index += value;
            if (index >= previews.size()) {
                index = index % previews.size();
            }
        }
        return previews.get((int) index);
    }
}
