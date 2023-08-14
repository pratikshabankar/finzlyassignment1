package chessassignment;


import java.util.ArrayList;
import java.util.Scanner;

public class HorseMoves {
    public static boolean isValidPosition(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public static ArrayList<int[]> possibleKnightMoves(int x, int y) {
        ArrayList<int[]> moves = new ArrayList<>();
        int[][] possibleOffsets = {{1, 2}, {2, 1}, {-1, 2}, {-2, 1}, {1, -2}, {2, -1}, {-1, -2}, {-2, -1}};

        for (int[] offset : possibleOffsets) {
            int newX = x + offset[0];
            int newY = y + offset[1];
            if (isValidPosition(newX, newY)) {
                moves.add(new int[]{newX, newY});
            }
        }

        return moves;
    }

    public static void printBoard(ArrayList<int[]> moves) {
        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '.';
            }
        }

        for (int[] move : moves) {
            int x = move[0];
            int y = move[1];
            board[x][y] = 'X';
        }

        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position of the knight (e.g., 'A1'): ");
        String userInput = scanner.nextLine().toUpperCase();

        if (userInput.length() != 2 || !(userInput.charAt(0) >= 'A' && userInput.charAt(0) <= 'H') ||
                !(userInput.charAt(1) >= '1' && userInput.charAt(1) <= '8')) {
            System.out.println("Invalid input! Please enter a valid position.");
        } else {
            int x = userInput.charAt(0) - 'A';
            int y = userInput.charAt(1) - '1';
            ArrayList<int[]> moves = possibleKnightMoves(x, y);

            System.out.println("Possible moves for the knight at " + userInput + " are:");
            printBoard(moves);
        }
    }
}
