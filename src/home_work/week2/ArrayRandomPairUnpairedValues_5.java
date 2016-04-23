package home_work.week2;
import utils.ArrayUtils;

import java.util.Scanner;

//5) «аполнить массив случайными значени€ми. Ќа четных индексах парные значени€, на нечетных непарные


public class ArrayRandomPairUnpairedValues_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = in.nextInt();
        int[] mass = ArrayUtils.createArray(size);
                //new int[size];
        for (int x = 0; x < size; x++)
            //if(mass[x]%2==0) {
                //mass[x] = (int) ((Math.random() * 2));
           // }
        for (int i = 0; i < mass.length; i++)

        //{
            System.out.print(mass[i] + "  ");
        }
    }

