package home_work.week_3_1;

import java.util.Scanner;

//2. Ввести предложение с консоли, найти самое короткое и самое длинное слово.
//   Вывести найденные слова и их длину.




        public class ShortLongWord_1 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your message");
                String sentence = sc.nextLine();
                String min = " ";
                String max = " ";
                String[] massStringov = sentence.split(" ");

                for (int i = 0; i < massStringov.length; i++) {

                    if (massStringov[i].length() <= min.length())

                    {
                        min = massStringov[i];
                    }
                    if (massStringov[i].length() > max.length()) {
                        max = massStringov[i];
                    }

                }
                System.out.printf("Your minimal value - %s%nYour maximal value - %s%nLong minimal value-%s%nLong maximal value-%s%n"
                        ,min,max,min.length(),max.length());

            }
        }

