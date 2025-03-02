import java.util.Stack;

public class DecodeString {

    public static void decodeString(String str){
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currString = "";
        // String ans = "";
        int count = 0;

        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                count = count * 10 + (c-'0');
            } else if(c == '['){
                stringStack.push(currString);
                countStack.push(count);
                count = 0;
                currString = "";
            } else if(c == ']'){
                StringBuilder helper = new StringBuilder(stringStack.pop());
                int noOfCount = countStack.pop();
                for(int i=0; i<noOfCount; i++){
                    helper.append(currString);
                }
                currString = helper.toString() ;
                // ans += helper.toString();
            } else {
                currString += c;
            }
        }
        System.out.println("Decoded string is : "+currString);
        // System.out.println("Decoded string is : "+ans);
    }

    public static void main(String[] args) {
        // String str = "10[ab]5[c]2[d]";
        String str = "10[a]2[bc]";
        decodeString(str);
    }
}
