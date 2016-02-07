package oop_1.oop_homework_1;

/**
 * Created by admin on 07.02.2016.
 */
public class UseStudents {
    public static void main(String[] args) {
        Students student = new Students();
        student.initStudents("Stas",26,true,"Kostov","Nikolaevich");
        student.showFio();
        student.showStudent();
    }
}
