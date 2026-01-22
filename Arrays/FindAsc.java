package Arrays;

import java.util.Scanner;

public class FindAsc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        if(find(arr)){
            System.out.println("It is ascending order");
        }else{
            System.out.println("It is not ascending");
        }
    }

    static boolean find(int[] arr){
        if(arr.length==0){
            return false;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
