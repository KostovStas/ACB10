package home_work.week_3_1;
import java.util.Scanner;

// 5)Ввести предложение с консоли, каждое четное слово инвертировать, в каждом нечетном слове удалить каждую четную букву.
// Результат выводить на консоль.
// Ввод:   Как решить это задание и не сломать себе голову?
//  Вывод: каК ршт отэ здне и н ьтамолс сб ?уволог
// 5)Enter a sentence from the console, each even-numbered word is inverted in every odd word to delete every even numbered letter.
// The result is output to the console.

public class InvertedWordDeleteEveryEvenNumberedLetter_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message");
        String messag = sc.nextLine();
        String [] mass = messag.split(" ");
        for ( int i = 1; i <= mass.length; i++){

            if (i % 2 == 0){

                mass[i - 1] = new StringBuffer(mass[i-1]).reverse().toString();
            }
            if(i % 2 != 0){
                char[] initialarray = mass[i-1].toCharArray();
                int lenna;
                if (mass[i-1].length() % 2 == 0)
                    lenna = mass[i-1].length() / 2;
                else
                {
                    lenna = (mass[i-1].length()+1) / 2;
                }

                char[] newarray = new char[lenna];
                int num = 0;
                for (int j = 0; j < initialarray.length;j++) {
                    if (j % 2 == 0) {
                        newarray[num]=initialarray[j];
                        num++;
                    }
                }
                mass[i-1]="";
                for (int k=0;k<newarray.length;k++)
                    mass[i-1]=mass[i-1]+ newarray[k];


                }


            }

        for (int i=0 ;i<mass.length;i++ ){
            System.out.printf (mass[i] + " ");
        }

         }
}




