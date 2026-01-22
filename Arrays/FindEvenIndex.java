package Arrays;

import java.util.Scanner;

public class FindEvenIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int index = 0; index < nums.length; index++) {
            nums[index] = sc.nextInt();
        }
        System.out.println(find(nums));
    }

    static int find(int[] nums){
        if(nums.length==0){
            return -1;
        }
        int sum=0;
        for (int index = 0; index < nums.length; index++) {
            if(index%2==0){
                sum+=nums[index];
            }
        }
        return sum;
    }
}
