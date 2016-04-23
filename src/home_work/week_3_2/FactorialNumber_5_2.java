package home_work.week_3_2;

//5.2. To calculate the factorial of a number.

import java.util.Scanner;

public class FactorialNumber_5_2 {
    public static void main(String[] args) {
        System.out.println("Enter factorial of a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = 1;
        if (number<0)
        {
            System.out.println("Not valid input");
        }else {
            for (int i = 1; i <= number; i++) {
                temp = temp * i;

            }
            System.out.println("The factorial of a number = " + temp);
        }
    }
}
