package com.greatlearning.designpatter2;


public class EmployeeDriver { //DRIVER CLASS FOR EMPLOYEE coDE -- Builder problem soln
    public static void main(String [] args){
        System.out.println("Builder Pattern example");
        Employee employee1= new Employee.EmployeeBuilder(1,"self","kolkata",1000).setAtm_transactions(2).build();

        System.out.println(employee1);
    }
}
