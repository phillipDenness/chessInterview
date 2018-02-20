package com;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PieceFactory pieceFactory = new PieceFactory();
        pieceFactory.getPiece("pawn");

        KeypadChess keypad = new KeypadChess();

        ArrayList<Integer> coordinates = keypad.getPosition(0);
        Integer key = keypad.getKey(0,1);



    }
}
