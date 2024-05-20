package basicprogram;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 102));
        employees.add(new Employee("Bob", 101));
        employees.add(new Employee("Charlie", 103));

        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
