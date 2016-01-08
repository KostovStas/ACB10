package home_work.week_3_1;


// 2)Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».
// 2) Write a method that replaces in the string all instances of the word "woozle" with "censorship".


import java.util.Scanner;

public class ReplacesAndCensorship_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message, please");
        String sentences =sc.nextLine();
        String sentences2 = sentences.replaceAll("byaka", "censorship");
        System.out.println(sentences2);

    }

}
