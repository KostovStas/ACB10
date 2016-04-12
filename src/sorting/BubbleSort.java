package sorting;

import utils.ArrayUtils;

/**
 * Created by gorobec on 12.04.16.
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] mass = ArrayUtils.createRandomArray(10, 1, 100);

        ArrayUtils.printArray(mass);
        ArrayUtils.bubbleSort(mass);
        ArrayUtils.printArray(mass);

    }

}
