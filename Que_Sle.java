public class Que_Sle {
    public static void main(String[] args) {
        int arr[] = {70,60,20,50,40,5,19,21};
        int swap = 0;
        for(int i=0; i<arr.length-1; i++){
            int minPosition = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPosition] > arr[j]){
                    minPosition = j;
                }
            }
            if(i != minPosition){
                int temp = arr[minPosition];
                arr[minPosition] = arr[i];
                arr[i] = temp;
                swap++;
            }
            //the above if is not necessary. it is added to avoide uncessary swap when i==minposition. This will optimize code.
            
        } 

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    } 
}
