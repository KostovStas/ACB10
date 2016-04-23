package oop_1.oop_homework_1;




public class WorkFunkchion {

    public static int funk1 (int firstNumber, int secondNumber){
        int sum = firstNumber*secondNumber;
        return sum;
    }
    public static int funk2 (int sum){
        int sum2 = sum %6;
        return sum2;
    }
    public static void printrezult(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {

        System.out.println();

        printrezult(funk2(funk1(10,10)));

    }

}
