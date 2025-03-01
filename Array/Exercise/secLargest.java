package Array.Exercise;

import java.util.Arrays;

public class secLargest {

    // This code can be optimized  Time Complexity : O(n log n)

    // public static int getSecondLargest(int[] arr) {
    //     int n = arr.length;
    //     // Code Here
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length ; i++){
    //         max = Math.max(max,arr[i]);
    //     }
        
    //     Arrays.sort(arr);
    //     for(int i = n-1; i>=0; i--){
    //         if(arr[i] < max){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }

    public static int getSecondLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            } else if(arr[i] > secMax && arr[i] < max){
                secMax = arr[i];
            }
        }

        if(secMax == Integer.MIN_VALUE){
            return -1;
        }
        return secMax;
    }
    
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}
