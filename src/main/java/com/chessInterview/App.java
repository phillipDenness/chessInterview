package com.chessInterview;

import java.util.*;

public class App 
{
    private static final Integer LEGEALPHONENUMBERSIZE = 10;
    static final ArrayList pieceTypes = new ArrayList(Arrays.asList("rook","pawn","bishop","queen","king","knight"));

    public static void main( String[] args )
    {
        KeypadChess keypad = new KeypadChess();
        GetUserInput getUserInput = new GetUserInput();
        Integer startKey = getUserInput.getStartPosition();
        String pieceType = getUserInput.getPieceType();

        PieceFactory pieceFactory = new PieceFactory(keypad,startKey);
        Piece piece = pieceFactory.getPiece(pieceType);

        MovePieceEngine movePieceEngine = new MovePieceEngine(keypad.getNumberOfKeys());

        movePieceEngine.permutations(movePieceEngine.getInitialPhoneNumber(), LEGEALPHONENUMBERSIZE, piece);
        Integer totalGeneratedNumbers = piece.validKeys.size() + piece.validNumbers;
        System.out.println(totalGeneratedNumbers);

    }
}
