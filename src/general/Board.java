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
        freeSquare[0][0]=true;
        Rook bR2 = new Rook(0, 7);
        board[0][7] = bR2;
        freeSquare[0][7]=true;
        Knight bK1 = new Knight(0, 1);
        board[0][1] = bK1;
        freeSquare[0][1]=true;
        Knight bK2 = new Knight(0, 6);
        board[0][6] = bK2;
        freeSquare[0][6]=true;
        Bishop bB1 = new Bishop(0, 2);
        board[0][2] = bB1;
        freeSquare[0][2]=true;
        Bishop bB2 = new Bishop(0, 5);
        board[0][5] = bB2;
        freeSquare[0][5]=true;
        Queen bQ = new Queen(0, 3);
        board[0][3] = bQ;
        freeSquare[0][3]=true;
        King bK = new King(0, 4);
        board[0][4] = bK;
        freeSquare[0][4]=true;
        //Start position of white pieces
        Rook wR1 = new Rook(7, 0);
        wR1.setBlack(false);
        board[7][0] = wR1;
        freeSquare[7][0]=true;
        Rook wR2 = new Rook(7, 7);
        wR2.setBlack(false);
        board[7][7] = wR2;
        freeSquare[7][7]=true;
        Knight wK1 = new Knight(7, 1);
        wK1.setBlack(false);
        board[7][1] = wK1;
        freeSquare[7][1]=true;
        Knight wK2 = new Knight(7, 6);
        wK2.setBlack(false);
        board[7][6] = wK2;
        freeSquare[7][6]=true;
        Bishop wB1 = new Bishop(7, 2);
        wB1.setBlack(false);
        board[7][2] = wB1;
        freeSquare[7][2]=true;
        Bishop wB2 = new Bishop(7, 5);
        wB2.setBlack(false);
        board[7][5] = wB2;
        freeSquare[7][5]=true;
        Queen wQ = new Queen(7, 3);
        wQ.setBlack(false);
        board[7][3] = wQ;
        freeSquare[7][3]=true;
        King wK = new King(7, 4);
        wK.setBlack(false);
        board[7][4] = wK;
        freeSquare[7][4]=true;

        
        exeMove(wK, 2, 3, board, freeSquare);
        exeMove(wK, 7, 3, board, freeSquare);

    }

    public static void exeMove(Piece p1, int x, int y, Piece[][] p, boolean[][] b) {
        if (!b[x][y] || p[x][y].isBlack() != p1.isBlack()) {
            if (!b[x][y]) {
                System.out.println("Esto esta vaciooo, moviendo ficha jeje");
            } else {
                System.out.println("Son de distinto colo! ñam ñam...");
            }
            b[x][y] = true;
            b[p1.getX()][p1.getY()] = false;
            p1.move(x, y);
        } else {
            System.out.println("Está ocupada o son del mismo color :(");
            System.out.println(p1);
        }
    }

}
