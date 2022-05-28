package com.challages;

public class KnightTraversal {
    public static void main(String[] args) {
        knightTraversal(4, 4);
    }

    private static void knightTraversal(int x, int y) {
        int[][] boardMatrix = new int[8][8];
        boardMatrix[x][y] = 1;
        moveNight(2, 1, boardMatrix, x, y);
        moveNight(2, -1, boardMatrix, x, y);
        moveNight(-2, 1, boardMatrix, x, y);
        moveNight(-2, -1, boardMatrix, x, y);
        moveNight(1, 2, boardMatrix, x, y);
        moveNight(1, -2, boardMatrix, x, y);
        moveNight(-1, 2, boardMatrix, x, y);
        moveNight(-1, -2, boardMatrix, x, y);

//        for (int i = 0; i < boardMatrix.length; i++) {
//            for (int j = 0; j < boardMatrix[i].length; j++) {
//                if(boardMatrix[i][j] > 0) {
//                    System.out.println("x: " + i + ", y: " + j);
//                }
//            }
//        }
    }

    private static void moveNight(int x, int y, int[][] boardMatrix, int curX, int curY) {
        int newX = curX + x;
        int newY = curY + y;
        if(0 <= newX && newX <= 7 && 0 <= newY && newY <= 7) {
            boardMatrix[newX][newY] = 1;
            System.out.println("x: " + newX + ", y: " + newY);
        }

    }
}
