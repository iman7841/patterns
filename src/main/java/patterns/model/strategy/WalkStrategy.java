package patterns.model.strategy;

import patterns.iface.strategy.MovementStrategy;

public class WalkStrategy implements MovementStrategy {

    @Override
    public void movement() {
        System.out.println("can walk");
    }
}
