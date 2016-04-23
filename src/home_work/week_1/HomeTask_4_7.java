package home_work.week_1;
//Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и
// показываем результат деления (целую часть от деления  и остачу)
//в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

import java.util.Scanner;

public class HomeTask_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double i = x / y;
        double q = y / x;

        if (x % y == 0) {
            System.out.println("Tru"  + i);
        } else {
            System.out.println("False"  +i);
        }

    }
}



