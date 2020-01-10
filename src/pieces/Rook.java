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
public class Rook extends Piece {

    private static int x, y;
    private boolean black;

    public Rook(int x, int y) {
        super(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        }
    }

    public boolean isBlack() {
        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }

    public void move(int x, int y) {
        if (this.x != x && this.y == y) {
            this.setX(x);
        } else if (this.x == x && this.y != y) {
            this.setY(y);
        }
    }
}
