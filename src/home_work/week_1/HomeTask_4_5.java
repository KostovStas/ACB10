package home_work.week_1;//Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
// Если второе больше, то выводим сумму.

import java.util.Scanner;

public class HomeTask_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int y = sc.nextInt();

        if (i>y) {
            System.out.println(i-y);
        }
        
        if (i<y){
            System.out.println(i+y);
        }

        if (i==y){
            System.out.println("Chicla ravni");

        }
    }
}