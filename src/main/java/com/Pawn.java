package com;

import java.util.ArrayList;

public class Pawn extends Piece{
    private Boolean isQueen = false;

    public Pawn(KeypadChess keypad, Integer startKey) {
        super(keypad, startKey);
        checkReachedEndOfRow(pieceCoordinates.get(0));
    }

    public void checkReachedEndOfRow(Integer pieceRow){
        if (pieceRow.equals(0)){
            this.isQueen = true;
        }
    }
    @Override
    public void movePiece(Integer key){
        ArrayList<Integer> targetCoordinates = keypad.getCoordinates(key);

        if (validateMove(targetCoordinates)){
            this.pieceCoordinates = targetCoordinates;
            checkReachedEndOfRow(pieceCoordinates.get(0));
        }
    }

    public boolean validateMove(ArrayList<Integer> targetCoordinates){
        int xTargetPlane = targetCoordinates.get(0);
        int yTargetPlane = targetCoordinates.get(1);

        Integer xCurrentPlane = pieceCoordinates.get(0);
        Integer yCurrentPlane = pieceCoordinates.get(1);
        Integer xPlaneDifference = Math.abs(xCurrentPlane - xTargetPlane);
        Integer yPlaneDifference = Math.abs(yCurrentPlane - yTargetPlane);

        //Validate xPlane
        if (!isQueen){
            if (yCurrentPlane.equals(yTargetPlane) && xPlaneDifference == 2 && xCurrentPlane.equals(2) || xPlaneDifference == 2 && xCurrentPlane.equals(3) && yCurrentPlane.equals(1)|| xPlaneDifference == 1){
            //Validate yPlane
                return true;
            }
        }else{
            if (xCurrentPlane.equals(xTargetPlane) || yCurrentPlane.equals(yTargetPlane) || xPlaneDifference.equals(yPlaneDifference)){
                return true;
            }
        }
     //   pieceCoordinates;
        return false;
    }


}
