package home_work.week_3_1;

import java.util.Scanner;

// 2)Enter a sentence from the console, find the shortest and the longest word.
// The program prints the words and their length.




        public class ShortLongWord_1 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your message, please");
                String sentence = sc.nextLine();
                String min = " ";
                String max = "";
                String[] massStringov = sentence.split(" ");
                if (!sentence.isEmpty()) {

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
                }else {
                    System.out.println("String cannot be empty");
                }


            }
        }

