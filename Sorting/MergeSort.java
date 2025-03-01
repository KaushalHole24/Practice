package Sorting;

public class MergeSort{
    
    public static void peintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void mergeSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }

        int mid = start + (end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        mergeEle(arr, start, end, mid);
    }

    public static void mergeEle(int arr[], int start, int end, int mid){

        int temp[] = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=end){
            temp[k++] = arr[j++];
        }

        for(k=0, i=start; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,8,3,9,5,1,2,4,7};
        mergeSort(arr, 0, arr.length-1);
        peintArr(arr);
    }
}