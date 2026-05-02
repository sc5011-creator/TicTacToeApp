public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1)); // test
    }

    static boolean isValidMove(int row, int col) {

        // 1. Boundary check
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // 2. Empty cell check
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}