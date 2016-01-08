package home_work.week2;
import java.util.Scanner;

//7) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное

public class ArithmeticMeanMax_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite razmer massiva");
        int size = sc.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < size; i++)
            mass[i] = i;
        if (mass.length % 2 == 0) {
            int sum1 = 0;
            for (int i = 0; i < mass.length / 2; i++) {
                sum1 = sum1 + i;
            }
            if (mass.length % 2 == 0) {
                int sum2 = 0;
                for (int i = mass.length / 2; i < mass.length; i++) {
                    sum2 = sum2 + i;
                }
                if (sum1 > sum2) {
                    for (int y = 0; y < mass.length / 2; y++)
                        System.out.print(mass[y] + ",");

                }
                if (sum1 < sum2) {
                    for (int x = mass.length / 2; x < mass.length; x++)
                        System.out.print(mass[x] + ",");

                }

            }
        }
        if (mass.length % 2 != 0) {
            int sum1 = 0;
            for (int i = 0; i < mass.length / 2; i++)
                sum1 = sum1 + i;

            if (mass.length % 2 != 0) {
                int sum2 = 0;
                for (int i = mass.length / 2 + 1; i < mass.length; i++) {
                    sum2 = sum2 + i;
                }
                if (sum1 > sum2) {
                    for (int y = 0; y < mass.length / 2; y++)
                        System.out.print(mass[y] + ",");

                }
                if (sum1 < sum2) {
                    for (int x = mass.length / 2+1; x < mass.length; x++)
                        System.out.print(mass[x] + ",");

                }
            }
        }
    }
}
