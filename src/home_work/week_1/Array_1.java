package home_work.week_1;

public class Array_1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 15;
        arr[2] = 17;
        arr[3] = 22;
        arr[4] = 25;

        int pos = arr.length - 1;
        while (pos >= 0) {
            System.out.print(arr[pos] + " ");
            pos--;

        }

    }
}