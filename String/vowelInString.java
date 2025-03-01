package String;
import java.util.*;
public class vowelInString {
    public static int count(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void check() {
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }

    public static void replace(){
        String str = "ApnaCollege".replace("l","");
        System.out.println(str);
        // OUTPUT : ApnaCoege
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in); 
        // String str = sc.nextLine();
        // System.out.println(count(str));

        check();
    }
}
