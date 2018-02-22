package com;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class App 
{
    public static void main( String[] args )
    {
        KeypadChess keypad = new KeypadChess();
        
        PieceFactory pieceFactory = new PieceFactory(keypad,5);


        if (true) {
            Piece pawn = pieceFactory.getPiece("pawn");

            int targetKey = 2;
            System.out.println("Current Key: " + keypad.getKey(pawn.pieceCoordinates) + " Target: " + targetKey);
            pawn.movePiece(targetKey);
            targetKey = 4;
            System.out.println("Current Key: " + keypad.getKey(pawn.pieceCoordinates) + " Target: " + targetKey);
            pawn.movePiece(targetKey);
            System.out.println("Current Key: " + keypad.getKey(pawn.pieceCoordinates) + " Target: " + targetKey);

        }
        if (false) {

            Piece queen = pieceFactory.getPiece("queen");
            int targetKey = 3;
            System.out.println("Current Key: " + keypad.getKey(queen.pieceCoordinates) + " Target: " + targetKey);
            queen.movePiece(targetKey);
            System.out.println("Current Key: " + keypad.getKey(queen.pieceCoordinates) + " Target: " + targetKey);
        }
        if (false) {

            Piece rook = pieceFactory.getPiece("rook");
            int targetKey = 11;
            System.out.println("Current Key: " + keypad.getKey(rook.pieceCoordinates) + " Target: " + targetKey);
            rook.movePiece(targetKey);
            System.out.println("Current Key: " + keypad.getKey(rook.pieceCoordinates) + " Target: " + targetKey);
        }
        if (false) {

            Piece bishop = pieceFactory.getPiece("bishop");
            int targetKey = 4;
            System.out.println("Current Key: " + keypad.getKey(bishop.pieceCoordinates) + " Target: " + targetKey);
            bishop.movePiece(targetKey);
            System.out.println("Current Key: " + keypad.getKey(bishop.pieceCoordinates) + " Target: " + targetKey);
        }
        if (false) {

            Piece knight = pieceFactory.getPiece("knight");
            int targetKey = 4;
            System.out.println("Current Key: " + keypad.getKey(knight.pieceCoordinates) + " Target: " + targetKey);
            knight.movePiece(targetKey);
            System.out.println("Current Key: " + keypad.getKey(knight.pieceCoordinates) + " Target: " + targetKey);
        }
        if (false) {

            Piece king = pieceFactory.getPiece("king");
            int targetKey = 10;
            System.out.println("Current Key: " + keypad.getKey(king.pieceCoordinates) + " Target: " + targetKey);
            king.movePiece(targetKey);
            System.out.println("Current Key: " + keypad.getKey(king.pieceCoordinates) + " Target: " + targetKey);
        }

     /*   ArrayList<Integer> coordinates = keypad.getCoordinates(0);
        Integer key = keypad.getKey(0,1);
*/

    }
}
