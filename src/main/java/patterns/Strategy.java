package patterns;

import patterns.iface.strategy.MovementStrategy;
import patterns.model.strategy.MovementStrategyFactory;
import patterns.model.strategy.Person;

public class Strategy {

    public Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void movement() {
        MovementStrategy movementStrategy = MovementStrategyFactory.getMovementStrategy(person.getSpeed());
        System.out.print(person.getName() + " ");
        movementStrategy.movement();
    }
}
