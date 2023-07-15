// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only constant extra space.


public class find_the_Duplicate_Number {
    public static void main(String[] args) {

        int nums[] = {1,3,4,2,2};
        
        int dup[] = new int[nums.length+1];

        for(int val : nums){
            dup[val]++;
        }

        for(int i = 0; i < dup.length; i++){
            if(dup[i] >= 2 ) {
                System.out.println(i);
                break;
            }
        }

    }
}
