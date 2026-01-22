package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(find(nums));
    }

    static int find(int[] nums){
        if(nums.length==0)
            return  Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                secmax = max;
                max = num;
            } else if (num > secmax && num < max) {
                secmax = num;
            }
        }
        return secmax;
    }
}
