import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arrayToSort = {-8, 3, 5, 9, 11, 0, -5};
        int size = 7;

        selectionSort(arrayToSort,size);

        System.out.println("The sorted array is: ");
        for(int i = 0; i < size; i++ ){
            System.out.print(arrayToSort[i] + " ");
        }
    }

    private static void selectionSort(int[] arrayToSort, int size) {

        int minIndex;

        for(int i = 0; i < size; i++){
            minIndex = findMin(arrayToSort, i, size -1);

            int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[minIndex];
            arrayToSort[minIndex] = temp;
        }
    }

    private static int findMin(int[] arrayToSort, int start, int end) {

        int minIndex = start;

        for(int i = start + 1; i <= end; i++){
            if(arrayToSort[i] < arrayToSort[minIndex])
                minIndex = i;
        }

        return minIndex;
    }
}