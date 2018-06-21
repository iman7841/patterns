package patterns.model.strategy;

import patterns.iface.strategy.MovementStrategy;

public class RunStrategy implements MovementStrategy {

    @Override
    public void movement() {
        System.out.println("can run");
    }
}
