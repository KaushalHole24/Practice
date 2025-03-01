package Leetcode;

import java.util.Arrays;

// This question can also be solved with prefix array which will also reduce time complexity 

public class productExSelf {
    
    public static void product(int arr[]){
        int pro[] = new int[arr.length];
        
        for(int i=0;i<arr.length; i++){
            int product = 1;
            for(int j=0; j<arr.length; j++){
                if(i!=j){
                    product *= arr[j];
                }
                pro[i] = product;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(pro[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        product(arr);
    }
}
