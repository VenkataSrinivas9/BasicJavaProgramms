package basic.java.controlstatements.iterations;

public class SortUsingOneForloop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long startTime = System.currentTimeMillis();
        int[] array = { 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0 };
        int length = array.length;
        int i = 0, j = 0;
        for (i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
            if (i == length - 2) {
                i = -1;
                j++;
            }
            if (j == length - 2) {
                System.out.println(array);
                break;
            }
        }

        for(int x: array){
            System.out.print(x);
            System.out.print(", ");
        }
        
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();
        System.out.println("Time MilliSeconds: " + totalTime);
    }
}
