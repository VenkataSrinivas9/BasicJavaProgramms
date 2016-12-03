package basic.java.demo.searchAlgorithms;

/**
 * A binary search or half-interval search algorithm finds the position of a
 * specified value (the input "key") within a sorted array. In each step, the
 * algorithm compares the input key value with the key value of the middle
 * element of the array. If the keys match, then a matching element has been
 * found so its index, or position, is returned. Otherwise, if the sought key is
 * less than the middle element's key, then the algorithm repeats its action on
 * the sub-array to the left of the middle element or, if the input key is
 * greater, on the sub-array to the right. If the remaining array to be searched
 * is reduced to zero, then the key cannot be found in the array and a special
 * "Not found" indication is returned.
 * 
 * Every iteration eliminates half of the remaining possibilities. This makes
 * binary searches very efficient - even for large collections.
 * 
 * Binary search requires a sorted collection. Also, binary searching can only
 * be applied to a collection that allows random access (indexing).
 * 
 * Worst case performance: O(log n)
 * 
 * Best case performance: O(1)
 */
public class BinearySearch_DivideConquerTechnique {

    public int binarySearch(int[] inputArr, int key) {
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        BinearySearch_DivideConquerTechnique mbs = new BinearySearch_DivideConquerTechnique();
        int[] arr = { 2, 3, 9, 14, 18, 26, 33, 35, 45, 122, 156,187, 198, 234, 344, 444, 567, 876, 888, 899, 900, 976, 999 };
        System.out.println("Key 14's position: " + mbs.binarySearch(arr, 14));
        int[] arr1 = { 6, 34, 78, 123, 432, 900 };
        System.out
                .println("Key 432's position: " + mbs.binarySearch(arr1, 432));
        System.out.println();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Time MilliSeconds: " + totalTime);
    }

}
/**
 * 
 Output:
 
 Key 14's position: 6
 Key 432's position: 4
 */
