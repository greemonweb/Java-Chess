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
public class Knight extends Piece {
    private int x, y;
    private boolean black;

    public Knight(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        if (this.x == x + 2 && this.y == y + 1) {
            this.setX(x);
            this.setY(y);
        } else if (this.x == x + 2 && this.y == y - 1) {
            this.setX(x);
            this.setY(y);
        } else if (this.x == x - 2 && this.y == y - 1) {
            this.setX(x);
            this.setY(y);
        } else if (this.x == x - 2 && this.y == y + 1) {
            this.setX(x);
            this.setY(y);
        } else if (this.y == y + 2 && this.x == x + 1) {
            this.setX(x);
            this.setY(y);
        } else if (this.y == y + 2 && this.x == x - 1) {
            this.setX(x);
            this.setY(y);
        } else if (this.y == y - 2 && this.x == x + 1) {
            this.setX(x);
            this.setY(y);
        } else if (this.y == y - 2 && this.x == x - 1) {
            this.setX(x);
            this.setY(y);
        }
    }

}
