import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println("String: "+str);
        System.out.println("Double: "+d);
        System.out.println("Int: "+n);
        sc.close();
    }
}
