package patterns.model.strategy;

import patterns.iface.strategy.MovementStrategy;

public class MovementStrategyFactory {

    public static MovementStrategy getMovementStrategy(int speed) {
        if (speed <= 100) {
            return new WalkStrategy();
        } else {
            return new RunStrategy();
        }
    }
}