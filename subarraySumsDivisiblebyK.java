/*
 * Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
    A subarray is a contiguous part of an array.
 */

import java.util.HashMap;
import java.util.Map;

public class subarraySumsDivisiblebyK {
    public static void main(String[] args) {
        int arr[] = {4,5,0,-2,-3,1};
        int k = 5;

        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int rem = 0;
        int ans = 0;
        map.put(0, 1);

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            rem = sum % k;
            
            if(rem < 0){
                rem += k;
            }

            if(map.containsKey(rem)){
                int freq = map.get(rem);
                ans += freq;
                freq++;
                map.put(rem, freq);
            } else {
                map.put(rem, 1);
            }
        }

        System.out.println(ans);
    }
}
