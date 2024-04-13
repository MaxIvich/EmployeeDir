package org.example;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {


        Employee employee1 = new Employee(1,335566,"IVAN",1);
        Employee employee2 = new Employee(2,112233,"Stan",2);
        Employee employee3 = new Employee(3,223344,"Max",5);
        Employee employee4 = new Employee(4,334455,"IVAN",2);



        EmployeeDir employeeDir = new EmployeeDir();
        employeeDir.addEmployee(employee1);
        employeeDir.addEmployee(employee2);
        employeeDir.addEmployee(employee3);
        employeeDir.addEmployee(employee4);

        employeeDir.findForExp(2);
        employeeDir.findPhone("IVAN");

    }
}