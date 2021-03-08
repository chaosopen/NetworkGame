package com.haoran.spirit;

import lombok.Data;

import java.awt.*;

@Data
public abstract class Spirit {

    protected int x;

    protected int y;

    protected int w;

    protected int h;

    public abstract void update(int dt);

    public abstract void draw(Graphics g);
}
