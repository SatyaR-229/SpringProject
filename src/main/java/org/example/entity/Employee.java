package org.example.entity;

public class Employee {
    private String name;
    private String surname;
    private int rollNo;
    private Address address;

    public Employee() {
    }

    public Employee(String name, String surname, int rollNo,Address address) {
        this.name = name;
        this.surname = surname;
        this.rollNo = rollNo;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee :"+name+ "\n" +"surname :'" +surname +"\n"+ "rollNo :" + rollNo+"\n"+"Address :"+address ;
    }
}
