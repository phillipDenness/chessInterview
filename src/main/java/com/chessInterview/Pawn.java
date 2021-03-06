package com.chessInterview;

import java.util.ArrayList;

public class Pawn extends Piece{
    private Boolean isQueen = false;

    Pawn(KeypadChess keypad, Integer startKey) {
        super(keypad, startKey);
        checkReachedEndOfRow(pieceCoordinates.get(0));
    }

    private void checkReachedEndOfRow(Integer pieceRow){
        if (pieceRow.equals(0)){
            this.isQueen = true;
        }
    }
    @Override
    public Boolean movePiece(Integer key){
        ArrayList<Integer> targetCoordinates = keypad.getCoordinates(key);

        if (validateMove(targetCoordinates)){

            if (!(key==10) && !(key==12)) {
                validKeys.add(key);
            }

            this.pieceCoordinates = targetCoordinates;
            this.key = keypad.getKey(this.pieceCoordinates);
            checkReachedEndOfRow(pieceCoordinates.get(0));
            return true;
        }
        return false;
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
            if (targetCoordinates == pieceCoordinates || yCurrentPlane.equals(yTargetPlane) && xPlaneDifference == 2 && xCurrentPlane.equals(2) || xPlaneDifference == 2 && xCurrentPlane.equals(3) && yCurrentPlane.equals(1)|| xPlaneDifference == 1){
            //Validate yPlane
                return true;
            }
        }else{
            if (targetCoordinates == pieceCoordinates || xCurrentPlane.equals(xTargetPlane) || yCurrentPlane.equals(yTargetPlane) || xPlaneDifference.equals(yPlaneDifference)){
                return true;
            }
        }
     //   pieceCoordinates;
        return false;
    }


}
