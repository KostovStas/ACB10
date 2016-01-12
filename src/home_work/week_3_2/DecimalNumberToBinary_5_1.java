package home_work.week_3_2;

//5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число
//5.1. The translation from numbers with a decimal number system to binary, and Vice versa. The user enters the number

import utils.ArrayUtils;

import java.util.Scanner;

public class DecimalNumberToBinary_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        for (int i = 0; numbers==0; i++){

            numbers = numbers % 2;
            System.out.println(numbers);
            numbers = numbers/2;

        }
    }
}
