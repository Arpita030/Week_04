package Map_Interface.group_objects_by_property;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Arpita", "HR"));
        employees.add(new Employee("Manish", "IT"));
        employees.add(new Employee("Raj", "HR"));

        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(employees);

        for (String department : groupedEmployees.keySet()) {
            System.out.println(department + ": " + groupedEmployees.get(department));
        }
    }
}
