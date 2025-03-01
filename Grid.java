public class Grid {
    
    public static int ways(int right, int left, int n, int m){

        if(right == n-1 && left == m-1){
            return 1;
        } else if(right == n || left == m) {
            return 0;
        }

        int right_Way = ways(right+1, left, n, m);
        int left_Way = ways(right, left+1, n, m);

        int total_ways = right_Way + left_Way;

        return total_ways;
    }
    
    public static void main(String[] args) {
        int n = 4, m = 4;
        int totalWays = ways(0, 0, n, m);
        System.out.println(totalWays);
    }
}
