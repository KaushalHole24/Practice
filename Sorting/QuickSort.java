package Sorting;

public class QuickSort {
    
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int pivotIdx = partation(arr, start, end);
        quickSort(arr, start, pivotIdx-1);
        quickSort(arr, pivotIdx+1, end);
    }

    public static int partation(int arr[], int start, int end){
        int i = start-1;
        int pivot = arr[end];

        for(int j=start; j<end; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        
        return i;
    }
    
    public static void main(String[] args) {    
        int arr[] = {4,7,3,2,5,8,1,9};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
