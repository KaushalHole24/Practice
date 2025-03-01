package Sorting;

public class Merge_Array {
    public static void printArr(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(String arr[], int start, int end){
        if(start >= end){
            return;
        }

        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
            
    }

    public static void merge(String arr[], int start, int mid, int end){
        String[] arr3 = new String[end - start + 1];
        int i = start;
        int j = mid+1;
        int idx = 0;

        while(i<=mid && j<=end){
            if(isAlphabeticallySmaller(arr[i], arr[j])){
                arr3[idx] = arr[i];
                i++;
            } else {
                arr3[idx] = arr[j];
                j++;
            }
            idx++;
        }

        while(i<=mid){
            arr3[idx++] = arr[i++]; 
        }

        while(j<=end){
            arr3[idx++] = arr[j++];
        }

        for(idx=0, i=start; idx<arr3.length; idx++,i++){
            arr[i] = arr3[idx];
        }
        // return arr3;
    } 

    public static boolean isAlphabeticallySmaller(String str1, String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

