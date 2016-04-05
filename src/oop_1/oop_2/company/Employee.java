package oop_1.oop_2.company;

import oop_1.Cat;

import java.io.PrintStream;

/**
 * Created by admin on 31.03.2016.
 */
public class Employee {
    private  String name;
    private String  surname;
    private int age;
    private Cat cat;

    public String getName() {
        return name;
    }

    public Employee(String name, String surname, int age, Cat cat) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cat = cat;
    }

    public Employee (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
@Override
    public String toString (){
       return String.format("My name is %s %s, I am %d old", name, surname, age);
    }
    public  void doWork (){
        System.out.println("I work hard");
    }

    public void rest (){
        System.out.println("I am lazy, I rest");
    }

    @Override
    public boolean equals(Object obj) {
       if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Employee tmp = (Employee) obj;
        if(!this.name.equals(tmp.name)) return false;
        if(!this.surname.equals(tmp.surname)) return false;
        return true;
    }


}
