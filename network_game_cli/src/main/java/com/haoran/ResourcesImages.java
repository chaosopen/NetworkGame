package com.haoran;

import com.google.common.collect.Maps;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.Map;

import static com.haoran.Constants.positionUrl;

public class ResourcesImages {
    public static Map<String, Image> imageMap = Maps.newHashMap();

    static {
        for (int i = 13; i < 23; i++) {
            imageMap.put("frame_" + i, new ImageIcon(positionUrl + "people/frame_" + i + ".png").getImage());
        }
    }
}
