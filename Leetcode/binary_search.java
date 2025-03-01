package Leetcode;

public class binary_search {
    
        public static int binarysearch(int[] arr, int k) {
            // Code Here
            int start = 0;
            int end = arr.length-1;
            
            while(start <= end){
                int mid = (start + end)/2;
                
                if(arr[mid] == k){

                    if(mid == 0){
                        return mid;
                    } 
                    
                    while(arr[mid-1] == arr[mid]){
                        mid--;
                    }
                

                    return mid;
                }
                if(arr[mid] < k){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            
            return -1;
        }

        public static void main(String[] args) {
            int arr[] = {1, 1, 1, 1, 2};
            int key = 1;

            System.out.print(binarysearch(arr, key));
        }
    }

