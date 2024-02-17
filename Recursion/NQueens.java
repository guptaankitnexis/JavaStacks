package Recursion;

public class NQueens {
    public static void main(String[] args) {
        int n = 4; // Change this value to the desired size of the chessboard
        solveNQueens(n);
    }

    private static void solveNQueens(int n) {
        int[] board = new int[n];
        placeQueens(board, 0, n);
    }

    private static void placeQueens(int[] board, int row, int n) {
        if (row == n) {
            printSolution(board);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col;
                placeQueens(board, row + 1, n);
            }
        }
    }

    private static boolean isSafe(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || board[i] - i == col - row || board[i] + i == col + row) {
                return false;
            }
        }
        return true;
    }

    private static void printSolution(int[] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}




//
//class Solution {
//    public static ArrayList<ArrayList<Integer>> nQueen(int n) {
//        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
//        int[][] boardMatrix = new int[n][n];
//        int col = 0;
//        placeQueen(ansList, new ArrayList<>(),boardMatrix, col, n);
//        return ansList;
//    }
//
//    public static void placeQueen(ArrayList<ArrayList<Integer>> ansList,ArrayList<Integer> newList, int[][] boardMatrix, int col, int n) {
//        if (col == n) {
//            ansList.add(newList);
//            // saveBoard(ansList, boardMatrix);
//            return;
//        }
//        for (int row = 0; row < n; row++) {
//            if (isSafe(boardMatrix, row, col)) {
//                boardMatrix[row][col] = 1;
//                newList.add(col+1);
//                placeQueen(ansList,newList, boardMatrix, col + 1, n);
//                boardMatrix[row][col] = 0;
//                newList.remove(newList.size()-1);
//            }
//        }
//    }
//
//    public static boolean isSafe(int[][] boardMatrix, int row, int col) {
//        // Horizontal
//        for (int i = 0; i < col; i++) {
//            if (boardMatrix[row][i] == 1) {
//                return false;
//            }
//        }
//        // Upper left
//        int r = row;
//        int c = col;
//        while (r >= 0 && c >= 0) {
//            if (boardMatrix[r][c] == 1) {
//                return false;
//            }
//            r--;
//            c--;
//        }
//        // Lower left
//        r = row;
//        c = col;
//        while (r < n && c >= 0) {
//            if (boardMatrix[r][c] == 1) {
//                return false;
//            }
//            r++;
//            c--;
//        }
//        return true;
//    }
//
//    // public static void saveBoard(ArrayList<ArrayList<Integer>> ansList, int[][] boardMatrix) {
//    //     ArrayList<Integer> newList = new ArrayList<>();
//    //     for (int i = 0; i < boardMatrix.length; i++) {
//    //         for (int j = 0; j < boardMatrix.length; j++) {
//    //             if (boardMatrix[j][i] == 1) {
//    //                 newList.add(j+1);
//    //             }
//    //         }
//    //     }
//    //     ansList.add(newList);
//    // }
//}