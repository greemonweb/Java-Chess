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
        boolean ocupiedBoard[][] = new boolean[8][8];
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
        //Start position of white pieces
        Rook bR1 = new Rook(0, 0);
        Rook bR2 = new Rook(0, 7);
        Knight bK1 = new Knight(0, 1);
        Knight bK2 = new Knight(0, 6);
        Bishop bB1 = new Bishop(0, 2);
        Bishop bB2 = new Bishop(0, 5);
        Queen bQ = new Queen(0, 3);
        King bK = new King(0, 4);
        //Start position of black pieces
        Rook wR1 = new Rook(7, 0);
        wR1.setBlack(false);
        Rook wR2 = new Rook(7, 7);
        wR2.setBlack(false);
        Knight wK1= new Knight(7, 1);
        wK1.setBlack(false);
        Knight wK2= new Knight(7, 6);
        wK2.setBlack(false);
        Bishop wB1= new Bishop(7, 2);
        wB1.setBlack(false);
        Bishop wB2= new Bishop(7, 5);
        wB2.setBlack(false);
        Queen wQ= new Queen(7, 3);
        wQ.setBlack(false);
        King wK= new King(7, 4);
        wK.setBlack(false);
        
    }

}
