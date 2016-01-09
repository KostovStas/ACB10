package utils;

/**
 * Created by Sveta on 08.01.2016.
 */
public class MultiArrayUtils {
    public static int[][] createArray(int rows, int colums) {
        int[][] matrix = new int[rows][colums];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {

                matrix[i][j] = (int) (5 + Math.random() * (6 - 5));
            }

        }
        return matrix;
    }

    public static void printMultiArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

}
