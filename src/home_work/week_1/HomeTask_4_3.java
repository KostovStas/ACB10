package home_work.week_1;//Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.

import java.util.Scanner;

public class HomeTask_4_3 {
    public static void main(String[] args) {
        System.out.println("Vvedite   chislo");
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        if (a % 7 ==0)
            System.out.println(a*2);
    }
}
