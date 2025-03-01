package Leetcode;

public class maxMin {
    
    public static void maxMinArr(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(min+" "+max);
    }

    public static void main(String[] args) {
        int arr[] = {56789};
        maxMinArr(arr);
    }
}
