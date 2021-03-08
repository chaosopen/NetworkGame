package com.haoran;

import com.google.common.collect.Maps;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.Map;

import static com.haoran.Constants.positionUrl;

public class ResourcesImages {
    public static Map<String, Image> imageMap = Maps.newHashMap();

    static {
        imageMap.put("demo", new ImageIcon(positionUrl + "1.png").getImage());
    }
}
