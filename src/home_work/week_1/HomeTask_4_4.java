package home_work.week_1;

import java.util.Scanner;

// Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
public class HomeTask_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  i = sc.nextDouble();
        if (i>=0 && i<=1){
            System.out.println("Tru");
        }
        if (i<0 || i>1){
            System.out.println("False");
        }

    }
}