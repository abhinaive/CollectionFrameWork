package com.amigoscode;

import java.util.Arrays;

public class WorkingWith2DArrays {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for(int i = 0; i<3; i++){      // classical 2-D Array

            for(int j= 0; j<3; j++){
                board[i][j] = '-';
            }
        }

        char[][] boardTwo = new char[][]{    // inline 2-D Array
            new char[]{'-','-','-'},
            new char[]{'-','-','-'},
            new char[]{'-','-','-'},
        };

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        System.out.println(Arrays.deepToString(board));
    }
}
