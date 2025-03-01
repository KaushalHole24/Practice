package String;

public class parenthisis {
    public static void check(String s){
        int n = s.length();

        if(n%2 == 0){
            // if(s.charAt(0).equals(s.charAt(1))){
                System.out.println("Same element");
            }
            System.out.println("String are equal");
        }

             
        
    }

    public static void main(String[] args) {
        String s = "[]()";
        // System.out.println(check(s));
        check(s);
    }
}
