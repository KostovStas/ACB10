package opp.oop_1.oop_2.company;

import opp.oop_1.Cat;

import java.util.ArrayList;

/**
 * Created by admin on 31.03.2016.
 */
public class TestEmployee {
    public static void main(String[] args) {
        Cat cat = new Cat("Vas'ka");
        Cat cat2 = new Cat("Myrka");
        Cat cat3 = new Cat("Pet'ka");
        Employee worker = new Employee("Sveta","Ivanova",48);
        QA tester = new QA("Ivan", "Ivanov", 56, 5, 5000);
        Employee worker2 = new Employee("Ira","Ivanova",48);
        QA tester2 = new QA("Petya", "Petrov", 56, 5, 6000);
        tester2.addSalary(500);
        Employee worker3 = new Employee("Anja","Ivanova",48);
        Employee worker4 = new Employee("Anja","Ivanova",48);
        Employee tester3 = new QA("Kolja", "Koljanov", 56, 5, 7000);
        Employee tester4= new QA("Kolja", "Koljanov", 56, 5, 7000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(tester);
        employees.add(tester2);
        employees.add(tester3);
        showEmployees(employees);


        employees.remove(tester4);
        showEmployees(employees);
//      test getClass
        System.out.println(worker3.equals(cat));

    }

    private static void showEmployees(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }

    private boolean deleteByName(ArrayList<Employee> employees, String name){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getName().equals(name)){
                employees.remove(i);
                return true;
            }
        }
        return false;
    }
}
