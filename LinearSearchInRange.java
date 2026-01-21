package Arrays;

import java.util.Scanner;

public class LinearSearchInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the 6 numbers:");
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter start range:");
        int start = sc.nextInt();
        System.out.println("Enter end range:");
        int end = sc.nextInt();
        System.out.println("Enter target:");
        int target = sc.nextInt();
        System.out.println(find(arr,start,end,target));
    }

    static int find(int[] arr,int start,int end,int target){
        if(arr.length==0){
            return -1;
        }

        for (int i = start; i <=end ; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
