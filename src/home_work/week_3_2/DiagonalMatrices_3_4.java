package home_work.week_3_2;


//3.4. Создать массив, который будет состоять из диагонали матрицы
//3.4. To create an array that will consist of the diagonal matrices
//        1 3 5
//        4 5 7  -  1 5 6
//        4 5 6


import utils.MultiArrayUtils;

import java.util.Scanner;

public class DiagonalMatrices_3_4 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
                Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter columns");
        int columns = sc.nextInt();
        int[][] matrix =MultiArrayUtils.createArray(rows,columns);
        matrix[0][0]=1;
        matrix[1][1]=2;
        matrix[2][2]=3;
        MultiArrayUtils.printMultiArray(matrix);
    }

}
