package Leetcode;

public class reverseArr {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        print(arr);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse(arr);
    }   
}
