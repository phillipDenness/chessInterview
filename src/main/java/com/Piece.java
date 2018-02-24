package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Piece {

    KeypadChess keypad;
    Integer validNumbers = 0;
    ArrayList<Integer> pieceCoordinates;
    Integer key;
    Set<Integer> validKeys = new HashSet<>();

    public Piece(KeypadChess keypad,Integer startKey) {
        this.keypad = keypad;
        this.pieceCoordinates = keypad.getCoordinates(startKey);
        this.validNumbers++;
    }

    public abstract Boolean movePiece(Integer key);
    public abstract boolean validateMove(ArrayList<Integer> targetCoordinates);
}
