public class InversionCount {

    public static int count(int arr[], int start, int mid, int end){
        int temp[] = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        int inversion = 0;

        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                inversion+=(mid-i+1);
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

        return inversion;
    }
    
    public static int inversion(int arr[], int start, int end){
        int invCount = 0;

        if(start >= end){
            return 0;
        }

        int mid = start + (end - start)/2;
        invCount = inversion(arr, start, mid);
        invCount += inversion(arr, mid+1, end);
        invCount += count(arr, start, mid, end);

        return invCount;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,3,1,5,6,4,7,9,8};
        int inversion = inversion(arr, 0, arr.length-1);
        System.out.println(inversion);
        // inversion(arr, 0, arr.length-1);
    }
}
