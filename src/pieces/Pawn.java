/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pieces;

/**
 *
 * @author Ignacio
 */
public class Pawn extends Piece {
    private int x, y;
    private boolean black;
    private boolean firstMove;
    
    public Pawn(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void move(int x, int y) {
        if (black) {
            if (firstMove) {
                if (this.x + 2 == x) {
                    this.setX(x);
                }else if (this.x+1==x) {
                    this.setX(x);
                }
            }else{
                if (this.x+1==x) {
                    this.setX(x);
                }
            }
        }else{
            if (firstMove) {
                if (this.x - 2 == x) {
                    this.setX(x);
                }else if (this.x-1==x) {
                    this.setX(x);
                }
            }else{
                if (this.x-1==x) {
                    this.setX(x);
                }
            }
        }
    }
    
}
