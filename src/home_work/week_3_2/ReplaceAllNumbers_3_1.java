package home_work.week_3_2;


// ������� ������������ ���������� ������� � ������ ������� ������ ����.
//3.1. �������� ��� �����, ������� ������� �� 5 ��� ������ � ���������� ������� �� 8
//Matrix to generate random numbers and the size of the matrix entered by user.
//3.1. Replace all numbers, which are divided into 5 without astaci in a two-dimensional matrix for 8


import utils.MultiArrayUtils;

import java.util.Scanner;

public class ReplaceAllNumbers_3_1 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter colums");
        int colums = sc.nextInt();
        int[][] matrix = MultiArrayUtils.createArray(rows, colums);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 5 == 0) {

                    matrix[i][j]=8;
                }
            }
        }
        MultiArrayUtils.printMultiArray(matrix);
    }
}


