package home_work.week_3_2;
import utils.ArrayUtils;
import java.util.Scanner;
import java.lang.Math;

//5.1. The translation from numbers with a decimal number system to binary, and Vice versa. The user enters the number

public class DecimalNumberToBinary_5_1 {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
        System.out.println("Enter your decimal number");
        int numbers = sc.nextInt();
        if (numbers==4){
            int[] array = new int[numbers+1];
            for (int i = 0; i < 10; i++) {
                int temp = numbers % 2;
                numbers = numbers / 2;
                array[i] = temp;
                if (numbers == 0) break;
            }ArrayUtils.printArray(array);
        }else {
            int[] array = new int[numbers];// <<<????
            for (int i = 0; i < 10; i++) {
                int temp = numbers % 2;
                numbers = numbers / 2;
                array[i] = temp;
                if (numbers == 0) break;
            }ArrayUtils.printArray(array);
        }
        System.out.println("Enter binary number");
        int numbersBinari = sc.nextInt();
        int [] arrayBinari = new int[String.valueOf(numbersBinari).length()];
        for(int i = 0;i<arrayBinari.length; i++ )
        {
            int temp = numbersBinari % 10;
            numbersBinari = numbersBinari / 10;
            arrayBinari[i] = temp;
        }
        //ArrayUtils.printArray(arrayBinari);
        int[]mas2 = new int[arrayBinari.length];
        int z = (arrayBinari.length-1);
        for(int  i=0; i<arrayBinari.length; i++)
        {
            mas2[z] = arrayBinari[i];
            z--;
        }
        //ArrayUtils.printArray(mas2);
        int temp =0;
        for(int i= 0; i<arrayBinari.length; i++)
        {
            temp = temp+arrayBinari[i]*(int)(Math.pow(2,i));

        }
        System.out.println(temp);
//        System.out.println(Integer.toBinaryString(numbers));

//        System.out.println(Integer.parseInt("1010", 2));
    }
}
