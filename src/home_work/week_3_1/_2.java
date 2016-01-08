package home_work.week_3_1;

/**
 * Created by Sveta on 08.01.2016.

public class _2 {
    public static void main(String[] args) {
        String sentenses = "ax ti byaka byaka byaka";
        String byaka = "byaka";
       String [] sentenses2 = sentenses.split(" ");
         for (int i = 0; i<sentenses2.length; i++) {
             if (sentenses2[i] == byaka) {
                 int num = 0;
                 char [] newarray = new char [2];
                  newarray = sentenses2[i];
                  num++;

                 for (int j = 0; j < newarray.length; j++) {
                     System.out.printf(newarray[j] + " ");
                 }
             }
         }

    }
}
*/