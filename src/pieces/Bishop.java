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
public class Bishop extends Piece {
    
    private int x, y;
    private boolean black;
    
    public Bishop(int x, int y) {
        super(x, y);
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    public boolean isBlack() {
        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }
    
    private void move(int x, int y) {
        if (this.x - x == this.y - y) {
            this.setX(x);
            this.setY(y);
        }
    }
    
}
