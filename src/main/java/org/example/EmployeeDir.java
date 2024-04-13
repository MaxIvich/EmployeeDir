package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDir {

    ArrayList<Employee> Staff = new ArrayList<>();

    public void findForExp(int Exp){
        List<Employee> findForExpStaff=new ArrayList<>();
        for (int i = 0; i < Staff.size() ; i++) {
            if(Staff.get(i).EmployeeExp == Exp){
                findForExpStaff.add(Staff.get(i));
            }

        }
        System.out.println(findForExpStaff);

    }
    public void findPhone(String name){
        List<Employee> findPhoneStaff = new ArrayList<>();
        for (int i = 0; i < Staff.size() ; i++) {
            if(Staff.get(i).name.equals(name)){
                findPhoneStaff.add(Staff.get(i));
            }

        }
        System.out.println(findPhoneStaff);



    }
    public void findForServiceNumber(int serviceNumber){
        List <Employee> findForServiceNumber = new ArrayList<>();
        for (int i = 0; i < Staff.size() ; i++) {
            if(Staff.get(i).serviceNumber == serviceNumber){
                findForServiceNumber.add(Staff.get(i));
            }

        }
        System.out.println(findForServiceNumber);

    }
    public void addEmployee(Employee employee){
        Staff.add(employee);
    }
}
