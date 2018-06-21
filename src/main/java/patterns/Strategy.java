package patterns;

import patterns.iface.strategy.MovementStrategy;
import patterns.model.strategy.Person;
import patterns.model.strategy.RunStrategy;
import patterns.model.strategy.WalkStrategy;

public class Strategy {

    public Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void movement() {
        MovementStrategy movementStrategy = null;
        if (person.getSpeed() <= 100) {
            movementStrategy = new WalkStrategy();
        } else {
            movementStrategy = new RunStrategy();
        }
        System.out.print(person.getName() + " ");
        movementStrategy.movement();
    }
}
