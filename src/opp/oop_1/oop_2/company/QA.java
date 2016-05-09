package opp.oop_1.oop_2.company;

import opp.oop_1.Cat;

/**
 * Created by admin on 31.03.2016.
 */
public class QA extends Employee{

    private int workExperience;
    private int salary;

    public QA(String name, String surname, int age, Cat cat, int workExperience, int salary) {
        super(name, surname, age, cat);
        this.workExperience = workExperience;
        this.salary = salary;
    }

    public QA(String name, String surname, int age) {
        super(name, surname, age);
    }

    public QA(String name, String surname, int age, int workExperience, int salary) {
        super(name, surname, age);
        this.workExperience = workExperience;
        this.salary = salary;
    }
    public  int addSalary (int salary){
        return this.salary+=salary;

    }
    public  int addSalary (int salary, int bonus){
        return this.salary+=salary + bonus;

    }

    @Override
    public  void doWork (){
        System.out.println("I testing");
    }
@Override
    public String toString (){
        return super.toString() + String.format(" My work ex - %d, salary - %d", workExperience, salary);
    }

}
