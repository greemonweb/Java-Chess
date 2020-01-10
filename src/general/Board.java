/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import pieces.*;

/**
 *
 * @author Ignacio
 */
public class Board {

    public static void main(String[] args) {
        //x=vertical,y=horizontal;
        boolean freeSquare[][] = new boolean[8][8];
        Piece board[][] = new Piece[8][8];

        //Counter of white pieces.
        int wPawn = 8;
        int wRook = 2;
        int wKnight = 2;
        int wBishop = 2;
        int wQueen = 1;
        boolean wKing;
        //Counter of black pieces.
        int bPawn = 8;
        int bRook = 2;
        int bKnight = 2;
        int bBishop = 2;
        int bQueen = 1;
        boolean bKing;
        //Start position of black pieces
        Rook bR1 = new Rook(0, 0);
        board[0][0] = bR1;
        Rook bR2 = new Rook(0, 7);
        board[0][7] = bR2;
        Knight bK1 = new Knight(0, 1);
        board[0][1] = bK1;
        Knight bK2 = new Knight(0, 6);
        board[0][6] = bK2;
        Bishop bB1 = new Bishop(0, 2);
        board[0][2] = bB1;
        Bishop bB2 = new Bishop(0, 5);
        board[0][5] = bB2;
        Queen bQ = new Queen(0, 3);
        board[0][3] = bQ;
        King bK = new King(0, 4);
        board[0][4] = bK;
        //Start position of white pieces
        Rook wR1 = new Rook(7, 0);
        wR1.setBlack(false);
        board[7][0] = wR1;
        Rook wR2 = new Rook(7, 7);
        wR2.setBlack(false);
        board[7][7] = wR2;
        Knight wK1 = new Knight(7, 1);
        wK1.setBlack(false);
        board[7][1] = wK1;
        Knight wK2 = new Knight(7, 6);
        wK2.setBlack(false);
        board[7][6] = wK2;
        Bishop wB1 = new Bishop(7, 2);
        wB1.setBlack(false);
        board[7][2] = wB1;
        Bishop wB2 = new Bishop(7, 5);
        wB2.setBlack(false);
        board[7][5] = wB2;
        Queen wQ = new Queen(7, 3);
        wQ.setBlack(false);
        board[7][3] = wQ;
        King wK = new King(7, 4);
        wK.setBlack(false);
        board[7][4] = wK;
        
        System.out.println(Board.isFree(0,0,freeSquare));
        System.out.println(Board.isFree(0,1,freeSquare));
        System.out.println(Board.isFree(0,5,freeSquare));
        System.out.println(Board.isFree(7,0,freeSquare));
        if (!Board.isFree(1, 0, freeSquare)) {
            System.out.println(board[1][0]);
        }
    }

    public static boolean isFree(int x, int y, boolean[][] freeBoard) {
        if (freeBoard[x][y]) {
            return true;
        }
        return false;
    }
//    public static Piece getPiece(int x, int y, Piece[][] pieceBoard){
//        return pieceBoard[x][y].getClass();
//    }

}
