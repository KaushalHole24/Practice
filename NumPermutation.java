import java.util.HashSet;

public class NumPermutation {
    
    public static void allPermutation(StringBuilder str, StringBuilder ans, HashSet<String> result){

        if(str.length() == 0){
            result.add(ans.toString());
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            StringBuilder newStr = new StringBuilder(str.substring(0,i)+str.substring(i+1));
            allPermutation(newStr, new StringBuilder(ans).append(ch), result);
        }
    }
    
    public static void main(String[] args) {
        int count = 1;
        StringBuilder str = new StringBuilder("RRRDDD");
        StringBuilder ans = new StringBuilder("");
        HashSet <String> result = new HashSet<>();

        allPermutation(str, ans, result);

        for(String answer : result){
            System.out.println(count+"   "+ answer);
            count++;
        }
    }
}
