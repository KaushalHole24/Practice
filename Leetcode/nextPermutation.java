package Leetcode;
import java.util.*;
public class nextPermutation {
    
    public static void reverseArr(int arr[], int start){
        int end = arr.length-1;

        // Two login to reverse the array

        // for(int i=0; i<arr.length/2; i++){
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;

        //     start++;
        //     end--;
        // }

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    
    public static void swap(int nums[], int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    
    public static void next(int arr[]){
        int index1 = -1;
        int index2 = -1;
        int n = arr.length;

        for(int i=n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                index1 = i;
                break;
            }
        }

        if(index1 == -1){
            reverseArr(arr, 0);
            return;
        } else {
            for(int i=n-1; i>=0; i--){
                if(arr[i] > arr[index1]){
                    index2 = i;
                    break;
                }
            }
        }

        swap(arr, index1, index2);
        reverseArr(arr, index1+1);       
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3}; //(1,3,2)
       
        next(arr);  

        // Both are correct to print the array 

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        // System.out.println(Arrays.toString(arr));
        
    }
}
