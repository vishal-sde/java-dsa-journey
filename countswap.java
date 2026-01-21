package Arrays;

public class countswap {
    public static void main(String[] args){
        int[] nums = {5,4,3,2,1};
        int ans = sort(nums);
        System.out.println(ans);
    }

    static int sort(int[] arr){
        if(arr.length==0){
            return -1;
        }
        boolean swapped;
        int count = 0;
        for(int i = 0;i< arr.length;i++){
            swapped = false;
            for(int j = 1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                    count++;
                }
            }
            if (!swapped){
                break;
            }
        }
        return count;
    }
}
