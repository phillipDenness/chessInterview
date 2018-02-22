package com;

import java.util.ArrayList;

public class Rook extends Piece {
    public Rook(KeypadChess keypad, Integer startKey) {
        super(keypad, startKey);
    }

    public void movePiece(Integer key) {
        ArrayList<Integer> targetCoordinates = keypad.getCoordinates(key);

        if (validateMove(targetCoordinates)){
            this.pieceCoordinates = targetCoordinates;
        }
    }

    public boolean validateMove(ArrayList<Integer> targetCoordinates) {
        int xTargetPlane = targetCoordinates.get(0);
        int yTargetPlane = targetCoordinates.get(1);

        Integer xCurrentPlane = pieceCoordinates.get(0);
        Integer yCurrentPlane = pieceCoordinates.get(1);

        if (xCurrentPlane.equals(xTargetPlane) || yCurrentPlane.equals(yTargetPlane)){
                return true;
        }else {
            return false;
        }
    }
}
