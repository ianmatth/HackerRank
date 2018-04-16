import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort1 {

    static void insertionSort1(int n, int[] arr) {
        int e = arr[n-1];
        boolean sort = false;
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > e) {
                arr[i+1] = arr[i];
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
            else {
                arr[i+1] = e;
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                sort = true;
	 break;
            } 
        }
        if (!sort) {
            arr[0] = e;
            for (int l = 0; l < n; l++) {
                System.out.print(arr[l] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }
}
