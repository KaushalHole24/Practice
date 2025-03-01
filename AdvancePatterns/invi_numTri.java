package AdvancePatterns;

public class invi_numTri {
// LOGIC : 1

    // public static void pattern(int n){
    //     for(int i=n; i>=0; i--){
    //         for(int j=1; j<=i; j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

// LOGIC : 2 

    public static void pattern_2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i)+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // pattern(5);
        pattern_2(5);
    }
}
