package patterns;

import patterns.abstruct.bridge.RemoteControl;
import patterns.iface.bridge.TV;

public class Bridge extends RemoteControl {

    public Bridge(TV tv) {
        super(tv);
    }

    @Override
    public void changeChannel() {
        System.out.print("Bridge Channel is applied on ");
        tv.changeChannel();
    }
}
