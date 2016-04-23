package oop_1.oop_homework_1;


public class Test1 {

    public static void printNumber(){
        System.out.println("10");
    }
    public static int printNumber2(){
        return 5;
    }
    public static String printName ( String name){
        name = name + "0000";
        return name;
    }
    public static boolean printHello(boolean sex){
         if (sex == true){
             System.out.println("Hello world");
         }else{
             System.out.println("Sleep");
         }
        return sex;
    }
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        printHello(b);






        /*String surname = "123";
        System.out.println(surname+printName("Rimma"));*/

        /*int a = 2;
        int sum = a+printNumber2();
        System.out.println(sum);*/



        /*Student student1 = new Student("Stas","Kostov");
        student1.showStudentinfo();
        Student student2 = new Student("Igor","Root");*/


    }
}
