package com;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Integer legalPhoneNumberSize = 10;

        KeypadChess keypad = new KeypadChess();
        Integer startKey = 1;
        PieceFactory pieceFactory = new PieceFactory(keypad,startKey);

        Piece piece = pieceFactory.getPiece("queen");

        MovePieceEngine movePieceEngine = new MovePieceEngine(keypad.getNumberOfKeys());
        Stack<Integer> initialPhoneNumber = new Stack<>();

        movePieceEngine.permutations(initialPhoneNumber, legalPhoneNumberSize, piece);
        Integer totalGeneratedNumbers = piece.validKeys.size() + piece.validNumbers;
        System.out.println(totalGeneratedNumbers);

    }
}
