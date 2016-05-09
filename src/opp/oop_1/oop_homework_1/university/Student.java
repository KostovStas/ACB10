package opp.oop_1.oop_homework_1.university;


public class Student {
    private String name;
    private String surname;
    private String middlename;
    private int age;
    private boolean sex;

    public Student() {
    }

 public Student (String name,int age, boolean sex,String surname,String middlename){
        this.name=name;
        this.surname=surname;
        this.middlename=middlename;
        this.age=age;
        this.sex=sex;

    }


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void showStudentinfo(){

        System.out.println("Student name is " + name +" " + surname);
    }
    @Override
    public String toString(){

        return "Student name is " +name + " " + surname;
    }
    public  String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name){
        this.name = name;
    }
}

