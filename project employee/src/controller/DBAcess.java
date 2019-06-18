package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBAcess {

    String connectionString;

    public DBAcess() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connectionString = new String("jdbc:mysql://localhost:3306/projectdb");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Connection createConnection(){
        Connection dbcon = null;
        try {
             dbcon = DriverManager.getConnection(connectionString,"root","123");
        } catch (Exception e) {
            System.out.println("Connection Error"+e);
        }
       return dbcon;
    }

    public void closeConnection(Connection dbcon){
        try {
            dbcon.close();
        } catch (Exception e) {
            System.out.println("error in con close"+e);
        }
    }
    
}
