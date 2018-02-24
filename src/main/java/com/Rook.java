package com;

import java.util.ArrayList;

public class Rook extends Piece {
    public Rook(KeypadChess keypad, Integer startKey) {
        super(keypad, startKey);
    }

    public Boolean movePiece(Integer key) {
        ArrayList<Integer> targetCoordinates = keypad.getCoordinates(key);

        if (validateMove(targetCoordinates)){

            if (!(key==10) && !(key==12)) {
                validKeys.add(key);
            }

            this.pieceCoordinates = targetCoordinates;
            this.key = keypad.getKey(this.pieceCoordinates);

            return true;
        }
        return false;
    }

    public boolean validateMove(ArrayList<Integer> targetCoordinates) {
        int xTargetPlane = targetCoordinates.get(0);
        int yTargetPlane = targetCoordinates.get(1);

        Integer xCurrentPlane = pieceCoordinates.get(0);
        Integer yCurrentPlane = pieceCoordinates.get(1);

        if (targetCoordinates == pieceCoordinates || xCurrentPlane.equals(xTargetPlane) || yCurrentPlane.equals(yTargetPlane)){
                return true;
        }else {
            return false;
        }
    }
}
