import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // UC1 variables
    static char[][] board = new char[3][3];

    // UC2 variables
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {

        // UC1
        initializeBoard();
        printBoard();

        // UC2
        tossAndAssignSymbols();
        displayTossResult();

        // UC3
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    // ---------- UC1 ----------
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // ---------- UC2 ----------
    static void tossAndAssignSymbols() {
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human plays first");
        } else {
            System.out.println("Computer plays first");
        }

        System.out.println("Human symbol: " + humanSymbol);
        System.out.println("Computer symbol: " + computerSymbol);
    }

    // ---------- UC3 ----------
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }
}