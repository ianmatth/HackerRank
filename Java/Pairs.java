import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pairs {

    static int pairs(int k, int[] arr) {
        ArrayList<Integer>arrList = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            arrList.add(arr[i]);
        }
        Collections.sort(arrList);
        int n = 0;
        int i = 0;
        int j = 1;
        while(j < arr.length) {
            int d = Math.abs(arrList.get(j) - arrList.get(i));
            if (d == k) {
                n++;
                j++;
            } 
            else if (d > k) {
                i++;
            } 
            else if (d < k) {
                j++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = pairs(k, arr);
        System.out.println(result);
        in.close();
    }
}
