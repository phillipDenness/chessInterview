package com;

import java.util.Scanner;

import static com.App.pieceTypes;

public class GetUserInput {
    Scanner reader = new Scanner(System.in);  // Reading from System.in

    public Integer getStartPosition(){
        Integer position;
        System.out.println("Enter a valid start position: ");
        String n = reader.next();

        position = convertSymbols(n);

        if (!validateInput(position)){
            position = getStartPosition();
        }

        return position;
    }

    public String getPieceType(){

        System.out.println("Enter a chess piece" + pieceTypes + " : ");
        String n = reader.next();
        if (checkIfPiece(n)) {
            return n;
        }else{
            n=getPieceType();
        }

        return n;
    }

    private Boolean checkIfPiece(String pieceType) {

        if(pieceTypes.contains(pieceType.toLowerCase())) {
            return true;
        }else{
            return false;
        }
    }

    private Boolean validateInput(Integer startPosition) {
        if(startPosition < 13 && startPosition >= 0) {
            return true;
        }
        System.out.println("Must be a valid keypad key");
        return false;
    }

    private Integer convertSymbols(String Input){
        if(Input.equalsIgnoreCase("0")){
            return 11;
        }
        if(Input.equalsIgnoreCase("*")){
            return 10;
        }
        if(Input.equalsIgnoreCase("#")){
            return 12;
        }

        return Integer.parseInt(Input);
    }

}
