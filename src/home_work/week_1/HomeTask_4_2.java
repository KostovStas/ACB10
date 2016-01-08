package home_work.week_1;//ѕользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее

import java.util.Scanner;

public class HomeTask_4_2 {
    public static void main(String[] args) {
        System.out.println("Vvedite 3  chisla");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && a > c || a < c && a < b) {
            System.out.println(a);
        }
        if (b > c && b > a || b < a && b < c) {
            System.out.println(b);
        }
        if (c > a && c > b || c < a && c < b) {
            System.out.println(c);
        }

    }
}
