package home_work.week2;
import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        String nadpis="Bolice 5";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = in.nextInt();
        if(size>5)
            System.out.println(nadpis);
    }
}
