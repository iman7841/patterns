package patterns.abstruct.bridge;

import patterns.iface.bridge.TV;

public abstract class RemoteControl {
    public TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void changeChannel();
}
