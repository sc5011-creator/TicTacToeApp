public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Sample move
        placeMove(0, 0, 'X');

        // Check output
        System.out.println(board[0][0]);
    }

    // METHOD YOU NEED TO COMPLETE
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}