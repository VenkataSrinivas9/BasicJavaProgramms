package basic.java.controlstatements.iterations;

public class SortUsingOnlyOneForloop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long startTime = System.currentTimeMillis();
        int[] array = { 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0 };
        int lenght = array.length;
        for (int i = 0; i <= lenght - 1; i++) {
            int j = i + 1;
            // for(; j <= lenght - 1; j++){
            // if(array[i] == array[j]){
            // continue;
            // } else {
            // break;
            // }
            // }
            if (i < lenght && j < lenght) {
                do{
                    if(j <= lenght - 2){
                        j = j + 1;
                    } else{
                        break;
                    }
                }while(array[i] == array[j]);
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int x : array) {
            System.out.print(x);
            System.out.print(", ");
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();
        System.out.println("Time MilliSeconds: " + totalTime);
    }
}
