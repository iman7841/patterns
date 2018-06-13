package patterns;

import java.util.ArrayList;
import java.util.List;

import patterns.model.prototype.Employee;
import patterns.model.prototype.Office;

public class Prototype implements Cloneable {

    private List<Employee> employees;

    private List<Office> offices;

    public Prototype() {
        employees = new ArrayList<Employee>();
        offices = new ArrayList<Office>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void addOffice(Office o) {
        offices.add(o);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Office> getOffices() {
        return offices;
    }

    @Override
    public Prototype clone() {
        Prototype clonePrototype = new Prototype();
        clonePrototype.employees = this.employees;
        clonePrototype.offices = this.offices;
        return clonePrototype;
    }
}
