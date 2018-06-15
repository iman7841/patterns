package patterns.model.bridge;

import patterns.iface.bridge.TV;

public class SamsungTV implements TV {
    @Override
    public void changeChannel() {
        System.out.println("Samsung TV");
    }
}