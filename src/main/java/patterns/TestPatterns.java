package patterns;

import java.util.List;

import patterns.iface.composite.Runner;
import patterns.model.adapter.FrenchPerson;
import patterns.model.composite.HurdleRunner;
import patterns.model.composite.SprintRunner;
import patterns.model.prototype.Employee;
import patterns.model.prototype.Office;

public class TestPatterns {

    public static void main(String args[]) {
        TestPatterns testPatterns = new TestPatterns();
        testPatterns.testPrototype();

        testPatterns.testAdapter();

        testPatterns.testComposite();
    }

    public void testComposite() {
        Composite composite = new Composite();

        Runner runner = new HurdleRunner();
        composite.add(runner);
        runner = new SprintRunner();
        composite.add(runner);

        composite.running("A");
        composite.running("B");
    }

    public void testAdapter() {
        Adapter adapter = new Adapter();
        FrenchPerson frenchPerson = new FrenchPerson();
        frenchPerson.setNom("Imran");
        adapter.setName(frenchPerson);
        System.out.println(adapter.getName());
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
