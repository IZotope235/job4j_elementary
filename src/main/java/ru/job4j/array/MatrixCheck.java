package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (char el: board[row]) {
            if (el != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
