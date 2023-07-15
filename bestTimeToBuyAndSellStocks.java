public class bestTimeToBuyAndSellStocks{
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4}; //output : 5

        
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr){

        int len = arr.length;
        if(len == 1) return 1;

        int profit = 0;
        int buy = arr[0];
       
        for(int i = 1; i < len; i++){
            if(buy > arr[i]){
                buy = arr[i];
            } else {
                profit = Math.max(profit, arr[i]-buy);
            }
        }

        return profit;

    }
}