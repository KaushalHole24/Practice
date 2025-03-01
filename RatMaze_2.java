public class RatMaze_2 {

    public static boolean isSafe(int maze[][], int row, int col){
        int n = maze.length;
        if(row>=0 && row<n && col>=0 && col<n && maze[row][col]==1){
            return true;
        }
        return false;
    }

    public static int countWays(int maze[][], int row, int col){
        int n = maze.length;
        int right=0, down=0;

        if(row == n-1 && col == n-1){
            return 1;
        }else if(row == n || col == n){
            return 0;
        }

        if(isSafe(maze,row,col)){
            right = countWays(maze, row+1, col);
            down = countWays(maze, row, col+1);
        }

        int totalWays = right + down;
        return totalWays;
    }
    
    // public static void solveMaze(int maze[][]){
    //     int totalways = countWays(maze, 0, 0);
    //     System.out.println(totalways);
    // }
    
    public static void main(String[] args) {
        int maze[][] = {{1,1,1,0},
                        {1,1,1,0},
                        {1,0,1,0},
                        {1,1,1,1}};

        // solveMaze(maze);
        System.out.println(countWays(maze, 0, 0));
    }
}
