package com.chessInterview;

import java.util.ArrayList;

public class Queen extends Piece {

    Queen(KeypadChess keypad, Integer startKey) {
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
        Integer xPlaneDifference = Math.abs(xCurrentPlane - xTargetPlane);
        Integer yPlaneDifference = Math.abs(yCurrentPlane - yTargetPlane);

        if (targetCoordinates == pieceCoordinates || xCurrentPlane.equals(xTargetPlane) || yCurrentPlane.equals(yTargetPlane) || xPlaneDifference.equals(yPlaneDifference)){
                return true;
        }
        return false;
    }
}
