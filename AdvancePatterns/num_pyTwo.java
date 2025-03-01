package AdvancePatterns;

public class num_pyTwo{
    // public static void pattern(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=(n-i); j++){
    //             System.out.print(" ");
    //         } 
    //         int num1 = i;           
    //         for(int j=1; j<=i; j++){
    //             System.out.print(num1);
    //             num1--;
    //         }
    //         int num2 = 2;
    //         for(int j=1; j<=i-1; j++){
    //             System.out.print(num2);
    //             num2++;
    //         }
    //         System.out.println();

    //     }
    // }         
    
    // Login 2

    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=i; j>0; j--){
                System.out.print(j);
            }

            for(int j=2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}