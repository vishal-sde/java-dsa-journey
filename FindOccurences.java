package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FindOccurences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        find(arr,target);
    }

    static void find(int[] arr,int target){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i< arr.length;i++){
            if(arr[i]==target){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            System.out.println("Target not found");
        }else{
            System.out.println(list);
        }
    }
}
