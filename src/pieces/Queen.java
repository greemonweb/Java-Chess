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
public class Queen extends Piece {
    private String name;

    private int x, y;
    private boolean black;

    public Queen(int x, int y) {
        super(x, y);
        this.name = "Queen";
    }

    @Override
    public void move(int x, int y) {
        if (this.x - x == this.y - y) {
            this.setX(x);
            this.setY(y);
        } else if (this.x != x && this.y == y) {
            this.setX(x);
        } else if (this.x == x && this.y != y) {
            this.setY(y);
        }
    }

}
