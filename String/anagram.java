package String;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "Care";
        String str2 = "race";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char[] str1ToCharArray = str1.toCharArray();
            char[] str2ToCharArray = str2.toCharArray();

            Arrays.sort(str1ToCharArray);
            Arrays.sort(str2ToCharArray);

            boolean result = Arrays.equals(str1ToCharArray, str2ToCharArray);
            if(result){
                System.out.println("String are anagram.");
            } else{
                System.out.println("String are not anagram.");
            }
        } else {
            System.out.println("String are not anagram");
        }

        
    }
}
