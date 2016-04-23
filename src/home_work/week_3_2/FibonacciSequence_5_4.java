package home_work.week_3_2;

// 5.4the Fibonacci sequence

public class FibonacciSequence_5_4 {
    public static void main(String[] args) {

        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = firstNumber + secondNumber;
        System.out.print(firstNumber +" " +secondNumber + " " );
        for(int i=0; i < 10; i++)
        {
            thirdNumber = firstNumber + secondNumber;
        System.out.print(thirdNumber + " ");
        firstNumber=secondNumber;
        secondNumber=thirdNumber;

        }

    }
}
