package org.example.entity;

public class Employee {
    private String name;
    private String surname;
    private int id;
    private Address address;

    public Employee() {
    }

    public Employee(String name, String surname, int id,Address address) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRollNo(int id) {
        this.id= id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee :"+name+ "\n" +"surname :'" +surname +"\n"+ "Id :" + id+"\n"+"Address :"+address ;
    }
}
