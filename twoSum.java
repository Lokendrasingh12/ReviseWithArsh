/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order. */

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int target = 6;
        int []arr = {3,2,4};
        int[] ans = findTwoSum(arr, target);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] findTwoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = {0,0};
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
                if(map.containsKey(target-nums[i]) && map.get(target-nums[i]) != i){
                    ans[1] = i;
                    ans[0] = map.get(target-nums[i]);
                }
            } else {
                if(map.get(target-nums[i]) != i){
                    ans[1] = i;
                    ans[0] = map.get(target-nums[i]);
                }
            } 
        }

        return ans;
        
    }
}
