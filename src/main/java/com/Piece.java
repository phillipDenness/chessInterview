package com;

import java.util.ArrayList;

public abstract class Piece {

    KeypadChess keypad;
    ArrayList<Integer> pieceCoordinates;

    public Piece(KeypadChess keypad,Integer startKey) {
        this.keypad = keypad;
        this.pieceCoordinates = keypad.getCoordinates(startKey);
    }

    public abstract void movePiece(Integer key);
    public abstract boolean validateMove(ArrayList<Integer> targetCoordinates);
}
