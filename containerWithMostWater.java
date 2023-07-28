public class containerWithMostWater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        
        int answer = maxArea(height);
        System.out.println(answer);
    }
    public static int maxArea(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
            int area = (right - left) * Math.min(height[left], height[right]);
            ans = Math.max(area, ans);

            if(height[left] > height[right]) right--;
            else left++;
        }

        return ans;
    }
}
