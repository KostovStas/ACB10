package home_work.week_3_2;


//3.5. �) �������� ���������� ������ ������� � ���������� � ���������� �������. (������ - ����� ��������� � ������)
//  b) �������� ���������� � ���������� ������� � ���������� �������.
//3.5. a) to Change the highest row of the array, with the least in a two-dimensional array. (Size - sum of elements in row)
// b) to Change the highest and lowest column in a two-dimensional array.

import utils.ArrayUtils;
import utils.MultiArrayUtils;
import java.util.Scanner;
public class ChangeRowAndColumn_3_5 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter columns");
        int columns = sc.nextInt();
        int sum = 0;
        int[][] matrix = MultiArrayUtils.createArray(rows, columns);
        int [] rows1 = new int[rows];
        int [] colums1 = new int[columns];
        int [] rowsnew1 = new int [rows];
        // summa po stroke
        int rowmax = 6; // peremennie
        int rowmin = 1; //
        int rowIndexMax = 0;
        int rowIndexMin = 0;

        MultiArrayUtils.printMultiArray(matrix);

       /* int smallestRowIdx = 0;
        int largestRowIdx = 0;
        int smallestRowSum = findSum(matrix[0]);
        int largestRowSum = findSum(matrix[rows -1]);

        for (int i = 1; i < rows; i++) {
            if(findSum(matrix[i]) < smallestRowSum){
                smallestRowSum = findSum(matrix[i]);
                smallestRowIdx = i;
            } else if(findSum(matrix[i]) > largestRowSum) {
                largestRowSum = findSum(matrix[i]);
                smallestRowIdx = i;
            }
        }

        int[] tmp = matrix[largestRowIdx]matrix[smallestRowIdx];
        matrix[largestRowIdx] = matrix[smallestRowIdx];
        matrix[smallestRowIdx] = tmp;
*/
        for (int i = 0; i < rows; i++)
         {
             int s = 0;
             for (int j = 0; j < columns; j++ )
                s += matrix[i][j];
             if (s >rowmax){
                 rowIndexMax = i;
                 rowmax=s;
             }
             if (s<rowmin){
                 rowIndexMin = i ;
                 rowmin = s ;
             }
         }

        for(int j =0; j< columns; j++ )
        {
            int temp = 0;
            temp = matrix[rowIndexMax][j];
            matrix[rowIndexMax][j] = matrix[rowIndexMin][j];
            matrix[rowIndexMin][j] = temp;

        }


               // summa po stolbcu
        for (int i = 0; i < columns; i++){
            for (int j = 0; j < columns; j++ ){
                colums1[i] += matrix[j][i];
            }
        }
        System.out.println("*************");
        MultiArrayUtils.printMultiArray(matrix);
    }

    private static int findSum(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return  sum;
    }
}
