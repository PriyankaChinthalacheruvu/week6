package com.greatlearning.designpatter1;

public class Employee {

    int empId;
    String empName;
    String empAddress;



    public Employee(String empName, String empAddress)
    {
        this.empName = empName;
        this.empAddress = empAddress;
    }

    public Employee() {
    }

    public int getEmpId()
    {
        return empId;
    }

    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public String getEmpAddress()
    {
        return empAddress;
    }

    public void setEmpAddress(String empAddress)
    {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + empId +
                ", emp_name='" + empName + '\'' +
                ", emp_address='" + empAddress + '\'' +
                '}';
    }
}