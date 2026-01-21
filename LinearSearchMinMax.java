package Arrays;

import java.util.Scanner;

public class LinearSearchMinMax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i = 0;i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Max(arr));
        System.out.println(Min(arr));
    }

    static int Min(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    static int Max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

}
