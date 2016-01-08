package home_work.week2;


import utils.ArrayUtils;

import java.util.Scanner;

public class _4Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        System.out.println("Enter min value :");
        int min = sc.nextInt();
        System.out.println("Enter max value :");
        int max = sc.nextInt();
        int[] array = ArrayUtils.createRandomArray(size, min, max);
        ArrayUtils.printArray(array);
        int minArrayValue = ArrayUtils.findMinValue(array);
        int maxArrayValue = ArrayUtils.findMaxValue(array);

        System.out.println("Min value - " + minArrayValue + ", max value - " + maxArrayValue);

        }
}
