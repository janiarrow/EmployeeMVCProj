package controller;

import java.sql.Connection;
import model.Employee;

public class EmployeeController {
    DBAcess dbacess;
    public EmployeeController() {
        dbacess = new DBAcess();
    }

    public int saveEmployee(Employee emp){
        int value = 0;
        try {
            Connection dbcon = dbacess.createConnection();
            String query = "insert into employee values("+emp.getEmp_id()+",'"+emp.getName()+"','"+emp.getAddress()+"',"+emp.getPhone_no()+")";
            value = dbcon.createStatement().executeUpdate(query);

        } catch (Exception e) {
            System.out.println("insert employee error"+e);
        }
        return value;
    }

    public int deleteEmployee(Employee emp){
        int value = 0;
        try {
            Connection dbcon =
                    dbacess.createConnection();
            value = dbcon.createStatement().executeUpdate("delete from employee where id="+emp.getEmp_id()+"");
        } catch (Exception e) {
            System.out.println("delete employee error"+e);
        }
        return value;
    }
}