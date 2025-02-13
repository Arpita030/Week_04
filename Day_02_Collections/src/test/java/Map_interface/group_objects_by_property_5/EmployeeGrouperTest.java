package Map_interface.group_objects_by_property_5;

import Map_Interface.group_objects_by_property.Employee;
import Map_Interface.group_objects_by_property.EmployeeGrouper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class EmployeeGrouperTest {

    @Test
    void testGroupByDepartment() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Arpita", "HR"));
        employees.add(new Employee("Manish", "IT"));
        employees.add(new Employee("Raj", "HR"));
        employees.add(new Employee("Dev", "Finance"));

        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(employees);

        assertEquals(3, groupedEmployees.size());
        assertTrue(groupedEmployees.containsKey("HR"));
        assertTrue(groupedEmployees.containsKey("IT"));
        assertTrue(groupedEmployees.containsKey("Finance"));

        assertEquals(2, groupedEmployees.get("HR").size());
        assertEquals(1, groupedEmployees.get("IT").size());
        assertEquals(1, groupedEmployees.get("Finance").size());

        assertEquals("Arpita", groupedEmployees.get("HR").get(0).name);
        assertEquals("Raj", groupedEmployees.get("HR").get(1).name);
        assertEquals("Manish", groupedEmployees.get("IT").get(0).name);
        assertEquals("Dev", groupedEmployees.get("Finance").get(0).name);
    }

    @Test
    void testEmptyList() {
        List<Employee> employees = new ArrayList<>();
        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(employees);
        assertTrue(groupedEmployees.isEmpty());
    }

    @Test
    void testSingleDepartment() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Eve", "Marketing"));
        employees.add(new Employee("Frank", "Marketing"));

        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(employees);

        assertEquals(1, groupedEmployees.size());
        assertTrue(groupedEmployees.containsKey("Marketing"));
        assertEquals(2, groupedEmployees.get("Marketing").size());
    }
}
