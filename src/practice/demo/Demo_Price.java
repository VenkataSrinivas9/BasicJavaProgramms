package practice.demo;

import java.util.Scanner;

public class Demo_Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        int[] index = new int[q];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j < q; j++){
            index[j] = sc.nextInt();
        }
        for(int r = k; r > 0; r--){
            int lastElement = arr[n-1];
            for(int s = 0; s <= n-2; s++){
                arr[n-s-1] = arr[n-s-2];
            }
            arr[0] = lastElement;
        }
        
        for(int x = 0; x < index.length; x++){
            System.out.println(arr[index[x]]);
        }
        
    }
}
