package Leetcode;
import java.util.*;
public class duplicateInArray {
    
    // BRUTE FORCE

    // public static boolean containDup(int arr[]){
    //     for(int i=0; i<arr.length-1; i++){
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[i] == arr[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    
    // OPTIMIZED CODE;

    public static boolean containDup(int arr[]){
        Arrays.sort(arr);

        for(int i=1; i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,3};

        System.out.println(containDup(arr));
    }
}
