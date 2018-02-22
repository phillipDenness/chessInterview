package com;

public class PieceFactory {
    private KeypadChess keypad;
    private Integer startKey;

    public PieceFactory(KeypadChess keypad,Integer startKey) {
        this.keypad = keypad;
        this.startKey = startKey;
    }

    //use getShape method to get object of type shape
    public Piece getPiece(String peiceType){
        if(peiceType.equalsIgnoreCase("queen")){
            return new Queen(keypad,startKey);
        }else if(peiceType.equalsIgnoreCase("pawn")){
            return new Pawn(keypad,startKey);
        }else if(peiceType.equalsIgnoreCase("rook")){
            return new Rook(keypad,startKey);
        }else if(peiceType.equalsIgnoreCase("bishop")){
            return new Bishop(keypad,startKey);
        }else if(peiceType.equalsIgnoreCase("knight")){
            return new Knight(keypad,startKey);
        }else if(peiceType.equalsIgnoreCase("king")){
            return new King(keypad,startKey);
        }

        return null;
    }

}
