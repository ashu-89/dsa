import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arrayToSort = {-8, 3, 5, 9, 11, 0, -5};
        int size = 7;

        insertionSort(arrayToSort,size);

        System.out.println("The sorted array is: ");
        for(int i = 0; i < size; i++ ){
            System.out.print(arrayToSort[i] + " ");
        }


    }

    private static void insertionSort(int[] arrayToSort, int size) {

        //Start with 1st element - assume it's sorted

        //2nd till last - one by one bring in sorted, put in right place

        for(int i = 1; i < size; i++){
            putElementInRightPosition(arrayToSort, i);
        }

    }

    private static void putElementInRightPosition(int[] arrayToSort, int i) {
        for(int j=i; j>0; j--){
            if(arrayToSort[j] < arrayToSort[j-1]){
                int temp = arrayToSort[j];
                arrayToSort[j]=arrayToSort[j-1];
                arrayToSort[j-1]=temp;
            }
        }
    }



}