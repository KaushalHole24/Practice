package Sorting;

public class selection {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void seSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minpoint = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpoint] > arr[j]){
                    minpoint = j;
                }
            }
            int temp = arr[minpoint];
            arr[minpoint] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2,6,8,3,5,0,1};
        seSort(arr);
        printArr(arr);
    }
}
