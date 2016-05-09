package opp.oop_1.oop_homework_1.university;

public class UseStudent {
    public static void main(String[] args) {
//      todo create more students and groups add students to different groups, add groups to university
        // create students
        Student student1 = new Student("Marina", "Zevko");
        Student student2 = new Student("Anna", "Petrovskaya");
        Student student3 = new Student("Petya", "Pypkin");
        Student student4 = new Student("Ira", "Melnik");
        Student student5 = new Student("Kolya", "Petrov");
        Student student6 = new Student ("Vetal", "Ivanov");
        Student student7 = new Student ("Ivan", "Sidorov");
        Student student8 = new Student ("Kris", "Vaidman");
        Student student9 = new Student ("Djon", "Djons");
        Student student10 = new Student ("Meny", "Pakiyao");
        Student student11 = new Student ("Floid", "Meyvazer");

        // create groups
        GroupOfStudents group1 = new GroupOfStudents("FKS",101);
        GroupOfStudents group2 = new GroupOfStudents("RAP",202);
        GroupOfStudents group3 = new GroupOfStudents("POP", 303);
        // Add students in group #1
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        // Add students in group #2
        group2.addStudent(student5);
        group2.addStudent(student6);
        group2.addStudent(student7);
        //Add students in group #3
        group3.addStudent(student8);
        group3.addStudent(student9);
        group3.addStudent(student10);
        group3.addStudent(student11);
        // create university
        University university = new University("NAU",3);
        // Add groups in university
        university.addGroup(group1);
        university.addGroup(group2);
        university.addGroup(group3);
        university.showAllStudents();
        System.out.println("-----------------");
        group1.showStudetGroup();
        System.out.println("-----------------");
        group1.deleteStudent("Ira","Melnik");
        group1.showStudetGroup();
        System.out.println("-----------------");
        university.deleteGroup("FKS",101);
        university.showGroups();
        System.out.println("-----------------");
        university.showAllStudents();
        System.out.println("-----------------");
        university.showGroups();
        System.out.println("-----------------");
        university.deleteGroup("RAP",202);
        university.showGroups();
        System.out.println("-----------------");
        university.showAllStudents();
//        setter test
        student11.setName("New Floid");
        System.out.println("-----------------");
        university.deleteStudent("Meny", "Pakiyao");
        university.showAllStudents();







    }
}
