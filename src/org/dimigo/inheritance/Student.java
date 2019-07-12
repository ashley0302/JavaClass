package org.dimigo.inheritance;

public class Student extends Person{
    private String studentId;

    public Student(String name, int age, int height, int weight,String studentId) {
        super(name, age, height, weight);
        this.studentId = studentId;

    }

    public void study(){
        System.out.println(getName()+"이/가 공부를 한다.");
    }

    public void rollCall(){
        System.out.println(getName()+"이/가 점호를 한다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                super.toString();
    }
}
