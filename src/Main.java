/*

NEED HELP
it just put the smallest number in front of everything and stops than

 */

public class Main {

    public static void main(String[] args) {

        int[] numbers = {15, 20, 12, 56, 7}; //defined numbers

        System.out.println("Unordered list");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); //print unordered numbers
        }
        System.out.println(); //just to be in the next line

        sortAlgorithm(numbers, 0, numbers.length-1); //sort from 0 to the length of the array numbers

        System.out.println("Ordered list");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); //print ordered list
        }
    }

    public static void merge(int[] array, int start, int mid, int end) {
        int l = mid - start + 1; //define l
        int m = end - mid; //define m

        int[] leftArray = new int[l]; //define the new array leftArray
        int[] rightArray = new int[m]; //define the new array rightArray

        for (int i = 0; i < l; i++) {
            leftArray[i] = array[start + i]; //first step to start
        }
        for (int i = 0; i < m; i++) {
            rightArray[i] = array[mid + 1 + i]; //first step to sort mid
        }

        int i = 0, j = 0;
        int k = start;

        while (i < l && j < m) { //while loop with a query if i defined as 0 is smaller than l && j defined as 0 is smaller than m
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i]; //put the number k in the array numbers into the leftArray at the position i
                i++;
            } else {
                array[k] = rightArray[j]; //put the number k in the array numbers into the rightArray at the position j
                j++;
            }
        }
        while (i < l) {
            array[k] = leftArray[i];
            i++;
            j++;
        }
        while (j < m) {
            array[k] = rightArray[j];
            i++;
            j++;
        }

    }

    public static void sortAlgorithm(int[] numbers, int start, int end){
        if (start < end){
            int mid = (start + end) / 2;
            sortAlgorithm(numbers,start,mid);
            sortAlgorithm(numbers,mid+1,end);
            merge(numbers,start,mid,end);
        }
    }

}