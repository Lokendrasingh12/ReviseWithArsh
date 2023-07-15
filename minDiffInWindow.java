// Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
// 1. Each student gets exactly one packet.
// 2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

import java.util.*;

public class minDiffInWindow {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};

        int m = 5; // output = 6

        long ans = findMinDiff(arr, arr.length, m);

        System.out.println(ans);

    }

    public static long findMinDiff (int a[], int n, int m)
    {
        // your code here
        
        Arrays.sort(a);
        
        int min = a[m-1]-a[0];

        int idx = 1;
        while(m < n){
            int newMin = a[m]-a[idx];
            min = Math.min(min, newMin);
            
            m++;
            idx++;
        }
        
        long ans = min;
        return ans;
    }
}
