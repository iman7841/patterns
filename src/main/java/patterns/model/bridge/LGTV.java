package patterns.model.bridge;

import patterns.iface.bridge.TV;

public class LGTV implements TV {
    @Override
    public void changeChannel() {
        System.out.println("LG TV");
    }
}