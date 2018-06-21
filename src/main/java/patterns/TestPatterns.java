package patterns;

import java.util.List;

import patterns.abstruct.bridge.RemoteControl;
import patterns.iface.composite.Runner;
import patterns.iface.decorator.Sandwich;
import patterns.iface.proxy.Bank;
import patterns.model.adapter.FrenchPerson;
import patterns.model.bridge.LGTV;
import patterns.model.bridge.SamsungTV;
import patterns.model.composite.HurdleRunner;
import patterns.model.composite.SprintRunner;
import patterns.model.decorator.CheeseDecorator;
import patterns.model.decorator.WhiteBreadSandwich;
import patterns.model.prototype.Employee;
import patterns.model.prototype.Office;
import patterns.model.strategy.Person;

public class TestPatterns {

    public static void main(String args[]) {
        TestPatterns testPatterns = new TestPatterns();

        System.out.println("Prototype\n==============");
        testPatterns.testPrototype();

        System.out.println("Adapter\n==============");
        testPatterns.testAdapter();

        System.out.println("Composite\n==============");
        testPatterns.testComposite();

        System.out.println("Proxy\n==============");
        testPatterns.testProxy();

        System.out.println("Bridge\n==============");
        testPatterns.testBridge();

        System.out.println("Decorator\n==============");
        testPatterns.testDecorator();

        System.out.println("Strategy\n==============");
        testPatterns.testStrategy();
    }

    public void testStrategy() {
        Person p1 = new Person("Imran", 100);
        Person p2 = new Person("Ahad", 200);

        Strategy strategy = new Strategy();
        strategy.setPerson(p1);
        strategy.movement();

        strategy.setPerson(p2);
        strategy.movement();
    }

    public void testDecorator() {
        Sandwich sandwich = new WhiteBreadSandwich("White Bread");
        System.out.println("Price of " + sandwich.getDescription() + " " + sandwich.calculatePrice());

        sandwich = new CheeseDecorator(sandwich);
        System.out.println("Price of " + sandwich.getDescription() + " " + sandwich.calculatePrice());
    }

    public void testBridge() {
        RemoteControl remoteControlSamsung = new Bridge(new SamsungTV());
        remoteControlSamsung.changeChannel();

        RemoteControl remoteControlLG = new Bridge(new LGTV());
        remoteControlLG.changeChannel();
    }

    public void testProxy() {
        Bank bank = new Proxy();
        bank.withdrawMoney(100);

        bank.withdrawMoney(11000);
        System.out.println();
    }

    public void testComposite() {
        Composite composite = new Composite();

        Runner runner = new HurdleRunner();
        composite.add(runner);
        runner = new SprintRunner();
        composite.add(runner);

        composite.running("A");
        composite.running("B");
        System.out.println();
    }

    public void testAdapter() {
        Adapter adapter = new Adapter();
        FrenchPerson frenchPerson = new FrenchPerson();
        frenchPerson.setNom("Imran");
        adapter.setName(frenchPerson);
        System.out.println("French Person is convert into Normal Person is " + adapter.getName());
        System.out.println();
    }

    public void testPrototype() {
        Prototype prototype = new Prototype();

        Employee emp = new Employee();
        emp.setFirstName("Imran");
        emp.setLastName("Mansuri");
        prototype.addEmployee(emp);

        emp = new Employee();
        emp.setFirstName("Ayaan");
        emp.setLastName("Mansuri");
        prototype.addEmployee(emp);

        Office off = new Office();
        off.setOfficName("Vodafone");
        prototype.addOffice(off);

        off = new Office();
        off.setOfficName("Idea");
        prototype.addOffice(off);

        printEmp(prototype.getEmployees());
        printOff(prototype.getOffices());

        System.out.println();

        Prototype clonePrototype = prototype.clone();

        emp = new Employee();
        emp.setFirstName("Ahad");
        emp.setLastName("Mansuri");
        clonePrototype.addEmployee(emp);

        off = new Office();
        off.setOfficName("Airtel");
        clonePrototype.addOffice(off);

        printEmp(prototype.getEmployees());
        printOff(prototype.getOffices());
        System.out.println();
    }

    public void printEmp(List<Employee> base) {
        base.stream().forEach(employee -> {
            System.out.print(employee.getFirstName() + " " + employee.getLastName() + " ");
        });
        System.out.println();
    }

    public void printOff(List<Office> base) {
        base.stream().forEach(office -> {
            System.out.print(office.getOfficName() + " ");
        });
        System.out.println();
    }
}
