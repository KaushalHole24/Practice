package Sorting;

import java.util.*;
import java.util.Collections;

public class newPrac {

    public static void printNums(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    
    public static void printNums1(Integer nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        
        for(int i=0; i<n-1; i++){
            int count = 0;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
            if(count == 0){
                break;
            }
        }
        

        printNums(arr);
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(i!=min){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }  
        }
        printNums(arr);
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

        printNums(arr);
    }

    public static void inbuildSort(int arr[]){
        // Acending order
        // Arrays.sort(arr);

        // Decending order : work only with object data type
        Integer arr1[] = {1,3,6,8,3,2,4};
        Arrays.sort(arr1,Collections.reverseOrder());
        printNums1(arr1);
    }

    public static void countingSort(int arr[]){

        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        printNums(arr);
    }
    
    public static void main(String[] args) {
        
        int nums[] = {5,4,1,3,2,8,6,9};

        // bubbleSort(nums);
        // selectionSort(nums);
        // insertionSort(nums);
        // inbuildSort(nums);
        countingSort(nums);

    }
}
