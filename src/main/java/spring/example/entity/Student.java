package spring.example.entity;
//\
public class Student {
    private int id;
    private String name;
    private String roll;
    private Library libInfo;

    public Student(int id, String name, String roll, Library libInfo) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.libInfo = libInfo;
    }

    @Override
    public String toString() {
        return "Student Id :"+id+"\n"+"Student Name :"+name+"\n"+"Student Roll :"+roll+"\n"+libInfo;
    }
}
