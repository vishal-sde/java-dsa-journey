package Arrays;

import java.util.Scanner;

public class LinearSearch2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {11, 27, 32},
                {25, 36, 47},
                {7, 9, 45}
        };

        int target = sc.nextInt();
        find(arr, target);
    }

    static void find(int[][] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Array is empty");

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    System.out.println("Target found at ["+i+"]["+j+"]");
                }
            }
        }

    }
}


