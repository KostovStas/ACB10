package metodsString;

/**
 * Created by admin on 31.03.2016.
 */
public class PracticMetodsString {
    public static void main(String[] args) {
        String arrayString [] = new String[5];
        for (int i = 0; i <arrayString.length ; i++) {
            arrayString[i]="Liolik Solnce";
        }
        if (arrayString[0].equals("Liolik Solnce")){
            System.out.println("Liolik  podcabluchnik");
        }
        System.out.println(arrayString.length);
        System.out.println(arrayString[0].length());
        System.out.println(arrayString[0].charAt(0));
        String array [] = new String[arrayString[0].toCharArray().length];
        System.out.println(array.length);
        String rez1 = arrayString[0].concat(arrayString[1]);
        System.out.println(rez1);
       String rez2 =   rez1.substring(0,6);
        System.out.println(rez2);
         int rez3 = rez2.codePointAt(1);
        System.out.println(rez3);
        System.out.println(arrayString[1].toString());
        //String array [] = new String[arrayString[0].length()];




        /*for (int i = 0; i <arrayString.length ; i++) {
            System.out.println(arrayString[i] + " ");

        }*/
    }
}
