package com;

import java.util.ArrayList;

public class Queen extends Piece {

    public Queen(KeypadChess keypad, Integer startKey) {
        super(keypad, startKey);
    }

    public void movePiece(Integer key) {
        //System.out.println(key);

        ArrayList<Integer> targetCoordinates = keypad.getCoordinates(key);

        if (validateMove(targetCoordinates)){

            this.pieceCoordinates = targetCoordinates;
            this.key = keypad.getKey(this.pieceCoordinates);
        }
    }

    public boolean validateMove(ArrayList<Integer> targetCoordinates) {
        int xTargetPlane = targetCoordinates.get(0);
        int yTargetPlane = targetCoordinates.get(1);

        Integer xCurrentPlane = pieceCoordinates.get(0);
        Integer yCurrentPlane = pieceCoordinates.get(1);
        Integer xPlaneDifference = Math.abs(xCurrentPlane - xTargetPlane);
        Integer yPlaneDifference = Math.abs(yCurrentPlane - yTargetPlane);

       // System.out.println(xPlaneDifference + "," + Math.abs(yPlaneDifference));

        if (targetCoordinates == pieceCoordinates || xCurrentPlane.equals(xTargetPlane) || yCurrentPlane.equals(yTargetPlane) || xPlaneDifference.equals(yPlaneDifference)){
            return true;
        }
        return false;
    }
}
