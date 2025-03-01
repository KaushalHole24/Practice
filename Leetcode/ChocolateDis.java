package Leetcode;
import java.util.*;
public class ChocolateDis {

    public static int chocoDis(int arr[],int m){
        Arrays.sort(arr);

        int minDif = Integer.MAX_VALUE;
        int dif = 0;

        for(int i=0; i+m-1 < arr.length ; i++){
           dif = arr[i+m-1] - arr[i];
           minDif = Math.min(dif, minDif);
        }
        return minDif;
    }

    // Code written using array list

    // class Solution {
    //     public int findMinDiff(ArrayList<Integer> arr, int m) {
    //         // Sort the array to ensure the m consecutive elements are valid
    //         Collections.sort(arr);
    
    //         int dif = 0;
    //         int minDif = Integer.MAX_VALUE;
    
    //         // Iterate through the sorted array to find the minimum difference
    //         for (int i = 0; i + m - 1 < arr.size(); i++) {
    //             dif = arr.get(i + m - 1) - arr.get(i);
    //             minDif = Math.min(dif, minDif);
    //         }
    //         return minDif;
    //     }
    // }

    public static void main(String[] args) {
        int arr [] = { 7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println(chocoDis(arr,m));
    }
}
