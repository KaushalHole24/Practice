import java.util.Stack;

public class Histogram {

    public static int[] nsr(int arr[]){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int nsr[] = new int[n];

        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = n;
            }else{
                nsr[i] = s.peek();
            }

            s.push(i);
        }
        return nsr;
    }

    public static int[] nsl(int arr[]){
        Stack<Integer> d = new Stack<>();
        int nsl[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            while(!d.isEmpty() && arr[d.peek()] >= arr[i]){
                d.pop();
            }

            if(d.isEmpty()){
                nsl[i] = -1;
            }else {
                nsl[i] = d.peek();
            }

            d.push(i);
        }
        return nsl;
    }
 
    public static void areaHistogram(int arr[], int nsr[], int nsl[]){
        int maxArea = 0;
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("MAx area in the histogram is : "+maxArea);
    }

    public static void main(String[] args) {
        int height[] = {2,4};
        int nsr[] = nsr(height);
        int nsl[] = nsl(height);
        areaHistogram(height, nsr, nsl);
    }
}