import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arrayToSort = {-8, 3, 5, 9, 11, 0, -5, -12};
        int size = 8;

        insertionSort(arrayToSort,size);

        System.out.println("The sorted array is: ");
        for(int i = 0; i < size; i++ ){
            System.out.print(arrayToSort[i] + " ");
        }


    }

    private static void insertionSort(int[] arrayToSort, int size) {

        //Assume we have 2 subdivisions - 1 sorted subdivision, 1 unsorted.
        //Left most - sorted subdivision

        //Start with 1st element - assume it's sorted
        //2nd till last - one by one bring in sorted, put in right place

        for(int i = 1; i < size; i++){


            int elementToPutInPlace;
            int j;

           // putElementInRightPosition(arrayToSort, i);

            elementToPutInPlace  = arrayToSort[i];
            j = i-1;

            //The order matters.
            //Code works if we first check j>=0 and then if arrayToSort[j] > elementToPutInPlace
            //However, if we first check whether arrayToSort[j] > elementToPutInPlace and then check for j >= 0,
            //In this special case where last element is smaller than 1st, code breaks - array index becomes -1.

            // while(arrayToSort[j] > elementToPutInPlace && j>=0) //This won't work!
            while( j>=0 && arrayToSort[j] > elementToPutInPlace){

                //only shift right - no need to swap !
                //int temp = arrayToSort[j+1];
                arrayToSort[j+1] = arrayToSort[j];
                //arrayToSort[j] = temp;
                j--;

            }

            //put the element in it's right place
            arrayToSort[j+1] = elementToPutInPlace;

        }

    }

//    private static void putElementInRightPosition(int[] arrayToSort, int i) {
//
//        int elementToPutInPlace = arrayToSort[i];
//        int j = i-1;
//
//        while(arrayToSort[j] > elementToPutInPlace && j >= 0){
//
//            //only shift right - no need to swap !
//            //int temp = arrayToSort[j+1];
//            arrayToSort[j+1] = arrayToSort[j];
//            //arrayToSort[j] = temp;
//            j--;
//
//        }
//
//        //put the element in it's right place
//        arrayToSort[j+1] = elementToPutInPlace;
//
//
//    }



}