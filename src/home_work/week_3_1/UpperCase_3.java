package home_work.week_3_1;

//Upper case.Write a program that allows the user to enter a string in the console,
// translates the first character of word to uppercase and outputs the result to the console.
// Input: ivan Output: Ivan


import java.util.Scanner;

public class UpperCase_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message");
        String message = sc.nextLine();
        String [] mass = message.split(" ");
        for (int i = 0; i < mass.length; i++)
        {//mass[i]= mass[i].substring(0,1).toUpperCase();
            //String temp1 = mass[i].substring(0,1);
            //Strin            g temp2 = mass[i].substring(0,1).toUpperCase();
            //mass [i] = mass[i].replace(mass[i].substring(0,1),mass[i].substring(0,1).toUpperCase());
            /*mass[i]=mass[i].toUpperCase().replace(mass[i].toUpperCase().substring(1,mass[i].length()),
                    mass[i].substring(1,mass[i].length()));*/

            char[] letters = mass[i].toCharArray();
            letters[0] = Character.toUpperCase(letters[0]);
            mass[i] = new String(letters);

        }

        for (int i=0;i<mass.length;i++ ){
            System.out.print(mass[i] + " ");
        }


    }
}
