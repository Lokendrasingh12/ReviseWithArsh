public class moveZeros {
    public static void main(String[] args) {
        int arr[] = {1,3,0,0,12};
        int idx = 0;
        int j = arr.length-1;

        while(idx < j){
            if(arr[idx] != 0) idx++;
            else if(arr[j] == 0) j--;
            else {
                for(int k = idx; k < j; k++){
                    arr[k] = arr[k+1];
                }
                arr[j] = 0;
                j--;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
