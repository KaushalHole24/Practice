package HackerRank;

import java.util.Scanner;

public class query {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int sum, result;

        for(int i=1 ; i<=q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            sum = a;
            for(int j=0; j<n; j++){
                result = (int)(Math.pow(2, j) * b);
                sum+=result;
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
