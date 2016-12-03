package basic.java.demo.sortAlgorithms;

import java.sql.Time;
import java.util.Timer;

/**
 * Bubble sort, also referred to as sinking sort, is a simple sorting algorithm
 * that works by repeatedly stepping through the list to be sorted, comparing
 * each pair of adjacent items and swapping them if they are in the wrong order.
 * The pass through the list is repeated until no swaps are needed, which
 * indicates that the list is sorted. The algorithm gets its name from the way
 * smaller elements "bubble" to the top of the list. Because it only uses
 * comparisons to operate on elements, it is a comparison sort. Although the
 * algorithm is simple, most of the other sorting algorithms are more efficient
 * for large lists.
 * 
 * Bubble sort has worst-case and average complexity both О(n2), where n is the
 * number of items being sorted. There exist many sorting algorithms with
 * substantially better worst-case or average complexity of O(n log n). Even
 * other О(n2) sorting algorithms, such as insertion sort, tend to have better
 * performance than bubble sort. Therefore, bubble sort is not a practical
 * sorting algorithm when n is large.Performance of bubble sort over an
 * already-sorted list (best-case) is O(n).
 */
public class BubbleSort {

    /**
     * @param args
     */
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) { // Looping the array
            for (int i = 0; i < n - 1; i++) { // Looping each element
                k = i + 1;
                if (array[i] > array[k]) { // Checking the element is less than
                                           // the next element in the row
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }

    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] input = { 10, 34, 2, 56, 7, 67, 88, 42, 10, 34, 2, 56, 7, 67, 88, 42,  10, 34, 2, 56, 7, 67, 88, 42, 10, 34, 2, 56, 7, 67, 88, 42};
        bubble_srt(input);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Time MilliSeconds: " + totalTime);
    }

}

/**
 * 
 Output:
 
 2, 4, 6, 9, 12, 23, 0, 1, 34
 2, 4, 6, 9, 12, 0, 1, 23, 34
 2, 4, 6, 9, 0, 1, 12, 23, 34
 2, 4, 6, 0, 1, 9, 12, 23, 34
 2, 4, 0, 1, 6, 9, 12, 23, 34
 2, 0, 1, 4, 6, 9, 12, 23, 34
 0, 1, 2, 4, 6, 9, 12, 23, 34
 0, 1, 2, 4, 6, 9, 12, 23, 34
 0, 1, 2, 4, 6, 9, 12, 23, 34
 0, 1, 2, 4, 6, 9, 12, 23, 34
 */ 