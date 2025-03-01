package Array.Exercise;
import java.util.*;
public class missingEle {

    public static int missing(int arr[]) {
        int n = arr.length+1;
        Arrays.sort(arr);

        for(int i=0; i<n-1; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }

        return n;
    }
    public static void main(String[] args) {
        int arr[] = { 2,1 };
        System.out.println(missing(arr));
    }
}
