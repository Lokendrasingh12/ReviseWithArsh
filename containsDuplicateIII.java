/*You are given an integer array nums and two integers indexDiff and valueDiff.

Find a pair of indices (i, j) such that:
1) i != j,
2) abs(i - j) <= indexDiff.
3) abs(nums[i] - nums[j]) <= valueDiff, and
Return true if such pair exists or false otherwise. 
*/

public class containsDuplicateIII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int indexDiff = 3, valueDiff = 0;

        boolean flag = false;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j <= i+indexDiff; j++) {
                if(j < nums.length){
                    if(Math.abs(i-j) <= indexDiff && Math.abs(nums[i]-nums[j]) <= valueDiff){
                        flag = true;
                        break;
                    }
                }
            }
        }

        if(flag){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
