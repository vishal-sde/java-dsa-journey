package Arrays;

public class PeakElement {
    public static void main(String[] args){
        int[] nums = {4,7,8,10,15,7,6,2};
        System.out.println(search(nums));
    }

    static int search(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end - start)/2;

            if(nums[mid]>nums[mid+1]){
                //i am in desecinding part
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
