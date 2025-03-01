package AdvancePatterns;

public class tri_0_1 {
    public static boolean isEven(int num){
        if (num%2 == 0) {
            return true;
        }
        return false;
    }
    
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(isEven(i+j)){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
