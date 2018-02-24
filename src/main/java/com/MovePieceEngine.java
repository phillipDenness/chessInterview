package com;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MovePieceEngine {
    private Set<Integer> possibleMoves = new HashSet<Integer>();
    private Stack<Integer> initialPhoneNumber = new Stack<>();

    public Stack<Integer> getInitialPhoneNumber(){
        return initialPhoneNumber;
    }

    public MovePieceEngine(Integer numberOfMoves){
        for (int i=1 ; i <= numberOfMoves ; i++) {
            possibleMoves.add(i);
        }
    }

    public void permutations(Stack<Integer> permutation, Integer size, Piece piece){
        if (permutation.size() == size) {
            piece.validNumbers++;
        }

        Integer[] availableItems = possibleMoves.toArray(new Integer[0]);

        for(Integer i : availableItems){
            Boolean didMove = piece.movePiece(i);

            //Do not add * or # to phone number
            if (didMove && !(i==10) && !(i ==12)){
                permutation.push(i);
                possibleMoves.remove(i);
                permutations(permutation, size, piece);
                possibleMoves.add(permutation.pop());
            }

        }
    }
}
