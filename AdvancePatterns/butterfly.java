package AdvancePatterns;

public class butterfly {
    public static void patter(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            for(int j=1; j<=(n-i)*2; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            for(int j=1; j<=(n-i)*2; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patter(10);
    }
}
