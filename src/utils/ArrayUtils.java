package utils;


public class ArrayUtils {
    public  static int[] createArray(int size){
        int [] mass = new int [size];
        for(int i = 0; i < size; i++) {
            mass[i] = i;
        }
        return  mass;
    }

    public static int[] createRandomArray (int size,int min, int max) {
        if (min>max){
            System.out.println("Change min max ");
            int temp=min;
            min=max;
            max=temp;
        } else if (min==max){
            System.out.println("Inkremet max +2 ");
            max+=2;//max=max+2
        }


        int[] numbers = new int[size];
        for(int i = 0; i < size; i++) {
            numbers[i] = (int) (min + Math.random() * (max - min ));
        }
        return numbers;
    }

    public  static void printArray(int [] array){

        for (int i=0;i<array.length;i++ ){
            System.out.print(array[i] + " ");

        }

        System.out.println();
    }

    public  static int findMinValue (int [] array){
        int minArrayValue = array[0];
        for (int i = 1; i<array.length; i++ ) {
            if (minArrayValue > array[i]) {
                minArrayValue = array[i];
            }
        }
        return minArrayValue;

    }

    public  static int findMaxValue (int [] array){
        int maxArrayValue = array[0];
        for (int i = 1; i<array.length; i++ ) {
            if (maxArrayValue < array[i]) {
                maxArrayValue = array[i];
            }
        }
        return maxArrayValue;
    }

    public static int [] randomValueOddEven (int size){

        int [] array = new int [size];
        for (int i=0; i<array.length;i++ ){
            if(i%2==0){
                array[i]=generateRandomEven();
            }else {
                array[i]=generateRandomOdd();
            }

        }

        return array;

    }
    //4etnue
   private static int generateRandomEven (){
       int numberEven=(int) ( Math.random() * 100 );
       if (numberEven % 2 != 0) { // esli ne4etnoe
           numberEven++;
       }
       return numberEven;
   }
    //ne 4etnue
    private static int generateRandomOdd (){
       int numberOdd=(int) ( Math.random() * 100 );
       if (numberOdd % 2 == 0) { // esli 4etnoe
           numberOdd++;
       }
       return numberOdd;
   }



}


