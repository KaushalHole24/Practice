package Leetcode;

public class maxSubArr {
    // PREFIX ARRAY Method

    public static void subSum(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix [] = new int [arr.length];
        prefix[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(i == 0){
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i-1];
                }

                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }


        // public static int maxSubArray(int[] nums) {
        //     int sum = 0;
        //     int maxSum = Integer.MIN_VALUE;
        //     int prefix [] = new int [nums.length];
        //     prefix[0] = nums[0];
    
        //     for(int i=1;i<nums.length;i++){
        //         prefix[i] = prefix[i-1] + nums[i];
        //     }
    
        //     for(int i=0; i<nums.length;i++){
        //         for(int j=i; j<nums.length; j++){
        //             if( i == 0){
        //                 sum = prefix[j];
        //             }else {
        //                 sum = prefix[j] - prefix[i-1];
        //             }
        //         }
        //         if(sum > maxSum){
        //             maxSum = sum;
        //         }
        //     }
        //     return maxSum;
        // } 


    // Kadane Algorithm 

    // public static void subSum(int arr[]){
    //     int sum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         sum += arr[i];
            // maxSum = Math.max(maxSum, sum);
    //         if(sum < 0){
    //             sum = 0;
    //         }
    //     }
    //     System.out.println(maxSum);
    // }


    // This is the best code with takle less time on max input


        // public int maxSubArray(int[] nums) {
        //     int n = nums.length;
        //     int max1 = nums[0];
        //     int sum1 = nums[0];
        //     for (int i = 1; i < n; i++) {
        //         if (sum1 < 0) {
        //             sum1 = 0;
        //         }
        //         sum1 += nums[i];
        //         max1 = Math.max(max1, sum1);
        //     }
        //     return max1;
        // }



    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        subSum(arr);
        // System.out.println(maxSubArray(arr)); 
    }
}
