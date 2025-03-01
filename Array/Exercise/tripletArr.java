package Array.Exercise;

public class tripletArr {

    public static void tripArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            int triplet[] = new int[3];
            
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<j; k++){
                    
                    if(arr[i] + arr[j] + arr[k] == 0){
                        triplet[0] = arr[i];
                        triplet[1] = arr[j];
                        triplet[2] = arr[k];
                    }
                }
    
            }
            for(int j=0; j<triplet.length; j++){
                System.out.println("("+triplet[j]+")");
            }
        }       
    }
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        tripArr(arr);
    }
}
