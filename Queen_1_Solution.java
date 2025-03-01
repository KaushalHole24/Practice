public class Queen_1_Solution {
    
    public static boolean n_Queens(char board[][], int row){
        
        if(row == board.length){
            return true;
        }
        
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(n_Queens(board, row+1)){
                    return true;
                }                
                board[row][j] = 'x';
            }            
        }
        
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col){

        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'x';
            }
        }

        if(n_Queens(board, 0)){
            System.out.println("Solution is Possible : ");
            printBoard(board);
        } else {
            System.out.println("Solution is not Possible.");
        }
    }
}
