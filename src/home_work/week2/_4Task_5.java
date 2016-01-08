package home_work.week2;


import com.sun.deploy.util.ArrayUtil;
import utils.ArrayUtils;

import java.util.Scanner;

public class _4Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int [] array= ArrayUtils.randomValueOddEven(size);
        ArrayUtils.printArray(array);

    }
}
