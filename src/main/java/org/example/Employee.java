package org.example;

public class Employee {
    int serviceNumber;
    int phoneNumber;
    String name;
    int EmployeeExp;

    public Employee(int serviceNumber, int phoneNumber, String name, int employeeExp) {
        this.serviceNumber = serviceNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        EmployeeExp = employeeExp;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeExp() {
        return EmployeeExp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "serviceNumber=" + serviceNumber +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", EmployeeExp=" + EmployeeExp +
                '}';
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeExp(int employeeExp) {
        EmployeeExp = employeeExp;
    }
}
