package String;

public class palindrome {

    public static boolean plaindromeStr(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int n = s.length();
        for(int i=0; i<n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(plaindromeStr(s));
    }
}
