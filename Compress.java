public class Compress {
    
    public static void compress(String str){
        StringBuilder ans = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while( i <str.length()-1 &&  str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count > 1){
                ans.append(count.toString());
            }
            ans.append(str.charAt(i));
            
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        // String str = "AAAABBB1111CCCDD";
        // compress(str);

        StringBuilder strBuilder = new StringBuilder();

        // Add 1 million 'A's
        for (int i = 0; i < 1000000; i++) {
            strBuilder.append('A');
        }
        // Add 1 million 'B's
        for (int i = 0; i < 1000000; i++) {
            strBuilder.append('B');
        }
        // Add 1 million 'C's
        for (int i = 0; i < 1000000; i++) {
            strBuilder.append('C');
        }

        String str = strBuilder.toString();
        compress(str);
      
    }
}
