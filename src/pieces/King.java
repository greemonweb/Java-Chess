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
public class King extends Piece {
    private String name;

    private int x, y;
    private boolean black;

    public King(int x, int y) {
        super(x, y);
        this.name = "King";
    }

}
