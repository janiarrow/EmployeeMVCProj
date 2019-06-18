package model;

public class Employee {
    private int emp_id;
    private String name;
    private String address;
    private int phone_no;

    public Employee() {
    }

    public Employee(int emp_id) {
        this.emp_id = emp_id;
    }

    public Employee(int emp_id, String name, String address, int phone_no) {
        this.emp_id = emp_id;
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
    }

    

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    
    
}