package com.cain_96.othello.Helper;

/**
 * Created by Cain96 on 2016/11/21.
 */
public class MainProcess {
    int[][] board;

    public MainProcess(int[][] board) {
        this.board = board;
    }

    public void tap(int x, int y, int turn) {
        board[y][x] = turn;
    }
}
