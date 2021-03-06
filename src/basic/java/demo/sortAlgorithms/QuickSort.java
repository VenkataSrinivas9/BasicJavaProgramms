package basic.java.demo.sortAlgorithms;

/**
 * Quicksort or partition-exchange sort, is a fast sorting algorithm, which is
 * using divide and conquer algorithm. Quicksort first divides a large list into
 * two smaller sub-lists: the low elements and the high elements. Quicksort can
 * then recursively sort the sub-lists.
 * 
 * Steps to implement Quick sort:
 * 
 * 1) Choose an element, called pivot, from the list. Generally pivot can be the
 * middle index element. 2) Reorder the list so that all elements with values
 * less than the pivot come before the pivot, while all elements with values
 * greater than the pivot come after it (equal values can go either way). After
 * this partitioning, the pivot is in its final position. This is called the
 * partition operation. 3) Recursively apply the above steps to the sub-list of
 * elements with smaller values and separately the sub-list of elements with
 * greater values.
 * 
 * The complexity of quick sort in the average case is Θ(n log(n)) and in the
 * worst case is Θ(n2).
 */
public class QuickSort {

    private int array[];

    private int length;

    public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        System.out.println("----------");
        System.out.println("lowerIndex = " + lowerIndex + "------- higherIndex = " + higherIndex);
        StringBuffer sb = new StringBuffer();
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        System.out.println("-----pivot----" + pivot);
        while (i <= j) {
            sb = new StringBuffer();
            for (int k = 0; k < array.length; k++) {
                sb.append(array[k]).append("|");
            }
            System.out.println(sb);
            /**
             * In each iteration, we will identify a number from left side
             * which is greater then the pivot value, and also we will
             * identify a number from right side which is less then the pivot
             * value. Once the search is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                System.out.println("exchangeNumbers " + array[i] +" " + array[j]);
                exchangeNumbers(i, j);
                // move index to next position on both sides
                i++;
                j--;
            }
        } // call quickSort() method recursively
        if (lowerIndex < j) {
            System.out.println("----------j ="+j);
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            System.out.println("----------i = "+i);
            quickSort(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String a[]) {
        long startTime = System.currentTimeMillis();
        QuickSort sorter = new QuickSort();
        int[] input = { 3, 7, 8, 5, 2, 1, 9, 5, 4 };
//        int[] input = { 10, 34, 2, 56, 7, 67, 88, 42, 10, 34, 2, 56, 7, 67, 88, 42,  10, 34, 2, 56, 7, 67, 88, 42, 10, 34, 2, 56, 7, 67, 88, 42};
        sorter.sort(input);
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Time MilliSeconds: " + totalTime);
    }
}

/**
 * 
 Output:
 * 
 * 2 2 12 20 24 45 53 56 56 75 99 
 */
