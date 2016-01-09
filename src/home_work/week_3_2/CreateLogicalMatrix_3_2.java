package home_work.week_3_2;

//Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
//To create a logical matrix according to the following criteria, if I equals j, then the element will be true.


import utils.MultiArrayUtils;

import java.util.Scanner;

public class CreateLogicalMatrix_3_2 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter colums");
        int colums = sc.nextInt();
       boolean[][] matrix =MultiArrayUtils.createArrayBoolean(rows,colums);
         for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (i==j) {

                matrix[i][j]=true;
            }
         }

    }

        MultiArrayUtils.printMultiArrayBoolean(matrix);
                }
           }




