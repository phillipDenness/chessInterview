package com;

public class PieceFactory {


    //use getShape method to get object of type shape
    public Piece getPiece(String peiceType){
        if(peiceType == null){
            return null;
        }
        if(peiceType.equalsIgnoreCase("pawn")){
            return new Pawn();
        }

        return null;
    }

}
