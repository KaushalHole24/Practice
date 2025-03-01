package Leetcode;

import java.util.Arrays;

public class twoSum {
    
        public static int[] twoSumindex(int[] nums, int target) {
            int n = nums.length;
            int sum = 0;
    
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    sum = nums[i] + nums[j];
                    if(sum == target){
                        return new int[] {i, j};
                    }
                }
            }
            return new int[] {};
        }
    
        public static void main(String[] args) {
            int arr[] = {2,7,11,15};
            int target = 9;
            System.out.print(Arrays.toString(twoSumindex(arr, target)));
        }
}
