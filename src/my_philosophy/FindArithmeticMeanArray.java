package my_philosophy;

//Find the arithmetic mean of the array from 10 elements of type double.

import java.util.Scanner;

public class FindArithmeticMeanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        if (size >= 0){
        double [] array = new double[size];
        double sum =0;
         for (int i = 0; i<array.length; i++){
             array [i]= i;
             sum = sum + array [i];
         }
        System.out.println("Summ " +sum/size);
        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        }else {
                System.out.println("Bad getavai");
            }

    }

}
