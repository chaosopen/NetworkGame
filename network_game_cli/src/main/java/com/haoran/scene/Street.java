package com.haoran.scene;

import com.haoran.spirit.DemoSpirit;

public class Street extends Scene {

    public Street() {
        DemoSpirit demoSpirit = new DemoSpirit();
        demoSpirit.setY(200);
        spiritList.add(demoSpirit);
    }
}
