package basicprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeV2 {
    String name;
    int id;
    int age;

    EmployeeV2(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age; // Added initialization for the age field
    }

    @Override
    public String toString() {
        return name + " (" + id + ", Age: " + age + ")";
    }
}

class AgeComparator implements Comparator<EmployeeV2> {
    @Override
    public int compare(EmployeeV2 emp1, EmployeeV2 emp2) {
        return Integer.compare(emp1.age, emp2.age); // Compare by age, not id
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<EmployeeV2> employees = new ArrayList<>();
        employees.add(new EmployeeV2("Alice", 102, 21));
        employees.add(new EmployeeV2("Bob", 101, 22));
        employees.add(new EmployeeV2("Charlie", 103, 25));

        Collections.sort(employees, new AgeComparator());

        for (EmployeeV2 employee : employees) {
            System.out.println(employee);
        }
    }
}
