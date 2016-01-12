package home_work.week_3_2;

//3.3. Написать метод, который проверяет является ли строка палиндромом
//3.3. Write a method that tests whether a string is a palindrome

import java.util.Scanner;

public class IfStringPalindrome_3_3 {
    public static void main(String[] args) {
        System.out.println("Enter your massage");
        Scanner sc = new Scanner(System.in);
        String massage = sc.nextLine();
        String massage2 = new StringBuilder(massage).reverse().toString();
        if(massage.equals(massage2)){
            System.out.println("is a palindrome");
        }else{
            System.out.println("is not a palindrome");
        }
    }
}
