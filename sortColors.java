/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects
 of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function. */

public class sortColors {
    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int val : arr) {
            if (val == 0)
                count0++;
            if (val == 1)
                count1++;
            if (val == 2)
                count2++;

        }

        int idx = 0;

        while (idx < arr.length) {
            if (count0 > 0) {
                arr[idx++] = 0;
                count0--;
                continue;
            } else if (count1 > 0) {
                arr[idx++] = 1;
                count1--;
                continue;
            } else {
                arr[idx++] = 2;
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
