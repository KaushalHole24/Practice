public class RatMaze {
    
    public static void printMaze(int maze[][]){
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze.length; j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int row, int col){
        if(row>=0 && row<maze.length && col>=0 && col<maze.length && maze[row][col] == 1){
            return true;
        }
        return false;
    }

    public static boolean solveMazeUntil(int maze[][], int row ,int col, int solution[][]){

        if(row == maze.length-1 && col == maze.length-1 && maze[row][col] == 1){
            solution[row][col] = 1;
            return true;
        }

        if(isSafe(maze, row, col)){
            if(solution[row][col] == 0){
                solution[row][col] = 1;
            }

            if(solveMazeUntil(maze, row+1, col, solution)){
                return true;
            }

            if(solveMazeUntil(maze, row, col+1, solution)){
                return true;
            }

            solution[row][col] = 0;
            return false;
        }
        return false;
    }

    public static boolean solveMaze(int maze[][]){
        int n = maze.length;
        int solution[][] = new int[n][n];
        if(solveMazeUntil(maze, 0, 0, solution)){
            System.out.println("Solution :");
            printMaze(solution);
            return true;
        }
        System.out.println("Solution dosen't exists.");
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = {{1,0,0,0},
                        {1,1,0,1},
                        {0,1,1,0},
                        {1,1,1,1}};
        
        solveMaze(maze);
    }
}
