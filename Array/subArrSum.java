package Array;

public class subArrSum { 
    public static void subArr(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){                
                curSum = 0;
                for(int k=i; k<=j; k++){
                    curSum+=num[k];
                }
                if (curSum >= maxSum) {
                    maxSum = curSum;
                }
                System.out.print(curSum+" ");
            }
            System.out.println();
        }
        System.out.println("Max Sum of the SubArrays = "+maxSum);
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12};
        subArr(num);
        
    }
}
