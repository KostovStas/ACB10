package home_work.week_1;
//������������ ������ �������� � ������� (������� ��� �� 0 �� 24)
//���� ����� �� 9 �� 18, �� ������� "� �� ������", � ������ ������ "� �������")
import java.util.Scanner;

public class HomeTask_4_1 {
    public static void main(String[] args) {

        System.out.println("Input time in range 0-24");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        String message;

        if (hour <= 8 || (hour <= 24 && hour >= 19) ) {
            message = "Home";
        }

        else if (hour>= 9 && hour<=18 ) {
            message = "At work";
        }

        else {
            message = "Wrong enter";
        }
        System.out.println(message);
    }
}

