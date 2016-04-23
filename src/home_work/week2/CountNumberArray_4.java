package home_work.week2;
import utils.ArrayUtils;

import java.util.Scanner;
//4) Посчитать сколько цифр(цифра задается пользователем) в массиве
public class CountNumberArray_4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("vvedite chislo");
        int number = in.nextInt();
        int [] mas = ArrayUtils.createArray(number);
        //int [] mas= new int [5];
        //mas[0]=5;
        //mas[1]=2;
        //mas[2]=87;
        //mas[3]=6;
        //mas[4]=2;
        int temp=0;
        for( int i=0;i<mas.length;i++)
            if(mas[i]==number)
                temp=temp+1;
        System.out.println(temp);
       // for(int i =0;number<mas.length;i++)
            //number=

        //System.out.printf (i);


    }
}