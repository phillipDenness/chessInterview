package com.chessInterview;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class KeypadChess {
    private LinkedHashMap<Integer,ArrayList<Integer>> xPlanes = new LinkedHashMap<>();

    public Integer getNumberOfKeys(){
        int total = 0;
        for (ArrayList<Integer> list : xPlanes.values()) {
            total += list.size();
        }
        return total;
    }
    public KeypadChess() {
        // 0 - 1 2 3
        ArrayList<Integer> firstRow = this.addRow(1,2,3);
        this.setRow(0,firstRow);
        // 1 - 4 5 6
        ArrayList<Integer>  secondRow = this.addRow(4,5,6);
        this.setRow(1,secondRow);
        // 2 - 7 8 9
        ArrayList<Integer>  thirdRow = this.addRow(7,8,9);
        this.setRow(2,thirdRow);
        // 3 - * 0 #
        ArrayList<Integer>  fourthRow = this.addRow(10,11,12);
        this.setRow(3,fourthRow);
    }

    private ArrayList addRow(int... numbers){
        ArrayList<Integer> row = new ArrayList();

        for (Integer number : numbers) {
            row.add(number);
        }

        return row;
    }

    private void setRow(int xPlane, ArrayList<Integer> row) {

        xPlanes.put(xPlane, row);
        System.out.println(row);
    }

    public Integer getKey(ArrayList<Integer> pieceCoordinates) {
        return getKey(pieceCoordinates.get(0), pieceCoordinates.get(1));
    }

    private Integer getKey(int xPlane, int yPlane){

        if (xPlane > xPlanes.size()) {
            return 99;
        }
        if (yPlane > 3){
            return 99;
        }
        ArrayList yPlanes = xPlanes.get(xPlane);
        Integer key = (Integer) yPlanes.get(yPlane);
        return key;
    }

    public ArrayList<Integer> getCoordinates(Integer key) {
        ArrayList<Integer> coordinates = new ArrayList();

        for (int x = 0 ; x < xPlanes.size() ; x++){
            ArrayList<Integer> yPlanes = xPlanes.get(x);

            for (int y = 0; y < yPlanes.size() ; y++) {
                if (key.equals(yPlanes.get(y))) {
                    coordinates.add(x);
                    coordinates.add(y);
                }
            }
        }

        return coordinates;
    }
}
