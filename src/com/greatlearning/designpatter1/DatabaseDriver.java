package com.greatlearning.designpatter1;

import java.sql.SQLException;
import java.util.List;

public class DatabaseDriver { //DRIVER CLASS TO TEST SINGLETON CLASS JDBC
    public static void main(String [] args) throws SQLException {
        System.out.println("Inside designpatter1 - Singleton DB connection");


        Employee emp = new Employee(); // employee clss inside designpattern 1
        emp.setEmpName("Priyanka");
        emp.setEmpAddress("Khammam");
        EmployeeDaoImplementation empDao = new EmployeeDaoImplementation();

        // add
        empDao.add(emp);


        // read
        Employee e = empDao.getEmployee(1);

        System.out.println(e.getEmpId() + " "
                + e.getEmpName() + " "
                + e.getEmpAddress());

        // read All
        List<Employee> ls = empDao.getEmployees();
        for (Employee allEmp : ls) {
            System.out.println(allEmp);
        }

        // update
        Employee tempEmployee = empDao.getEmployee(1);
        tempEmployee.setEmpAddress("Bangalore");
        empDao.update(tempEmployee);

        // delete
        empDao.delete(1);
    }
}

