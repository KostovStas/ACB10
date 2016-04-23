package home_work.week2;

//	8) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
//который получается в результате суммы arr1[i] + arr2[i]

public class SumMass_8 {
    public static void main(String[] args) {
        int size1=5;
        int [] mass1 = new int[size1];
        for (int i=0;i<mass1.length;i++)
            mass1[i]=i;
        int size2=5;
        int [] mass2 = new int [size2];
        for (int i=0;i<mass2.length;i++)
            mass2[i]=i;
        int [] mass3 = new int [size1];
        for (int i = 0; i < mass2.length; i++)
            mass3[i] = mass1[i] + mass2[i];
         for (int i=0;i<mass3.length;i++)
         {
             System.out.printf(mass3[i] + " ");
         }




    }

}
