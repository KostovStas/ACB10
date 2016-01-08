package home_work.week2;
import java.util.Scanner;
//6) Найти среднее арифметическое массива


public class ArithmeticMeanArray_6 {
    public static void main(String[] args)
    {
        double meanArray=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite chislo");
        int size = sc.nextInt();

        int[] mass = new int[size];
        for(int i=0;i<size;i++)
            mass[i]=i;
        if (mass.length>0)
        {
            double sum=0;
            for(int i=0;i<mass.length;i++)
            {
                sum +=mass[i];
            }
          meanArray=sum/mass.length;
        }
        System.out.println(meanArray);
    }
}
