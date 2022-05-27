package com.lee.designPrinciple;


import java.util.ArrayList;
import java.util.List;

// Demeter Principle
public class 迪米特法则 {
}


class Employee {

    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeEmployee {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}


class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        ArrayList<CollegeEmployee> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院的员工id = "+i);
            list1.add(emp);

        }
        return list1;
    }
}

class SchoolManager {
    public List<Employee> getAllEmployee() {
        ArrayList<Employee> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id = "+i);
            list1.add(emp);

        }
        return list1;
    }
}