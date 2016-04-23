package utils;

/**
 * Created by Sveta on 27.09.2015.
 */
public class _MinZnachArrey {
    public static int findMin(int[] mas) {
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        return min;
    }

}

