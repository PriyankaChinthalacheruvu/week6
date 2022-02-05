package com.greatlearning.designpatter1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImplementation
        implements EmployeeDao {

    static Connection con
            = DatabaseConnection.getConnection();

    //@Override
    public int add(Employee emp)
            throws SQLException
    {

        String query
                = "insert into employee(emp_name, "
                + "emp_address) VALUES (?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, emp.getEmpName());
        ps.setString(2, emp.getEmpAddress());
        int n = ps.executeUpdate();
        return n;
    }



    @Override
    public void delete(int id)
            throws SQLException
    {
        String query
                = "delete from employee where emp_id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public Employee getEmployee(int id)
            throws SQLException
    {

        String query
                = "select * from employee where emp_id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        Employee emp = new Employee();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            emp.setEmpId(rs.getInt("emp_id"));
            emp.setEmpName(rs.getString("emp_name"));
            emp.setEmpAddress(rs.getString("emp_address"));
        }

        if (check == true) {
            return emp;
        }
        else
            return null;
    }

    @Override
    public List<Employee> getEmployees()
            throws SQLException
    {
        String query = "select * from employee";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Employee> ls = new ArrayList();

        while (rs.next()) {
            Employee emp = new Employee();
            emp.setEmpId(rs.getInt("emp_id"));
            emp.setEmpName(rs.getString("emp_name"));
            emp.setEmpAddress(rs.getString("emp_address"));
            ls.add(emp);
        }
        return ls;
    }



    @Override
    public void update(Employee emp)
            throws SQLException
    {

        String query
                = "update employee set emp_name=?, "
                + " emp_address= ? where emp_id = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, emp.getEmpName());
        ps.setString(2, emp.getEmpAddress());
        ps.setInt(3, emp.getEmpId());
        ps.executeUpdate();
    }
}
