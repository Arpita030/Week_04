package Map_Interface.group_objects_by_property;

import java.util.*;

public class Employee {
    public String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}
