package com;

import java.util.ArrayList;

public class PhoneNumbers {
    ArrayList<Integer> legalPhoneNumber = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> totalLegalNumbers = new ArrayList<ArrayList<Integer>>();

    public void constructLegalNumber(Integer key) {

        legalPhoneNumber.add(key);

        if (legalPhoneNumber.size()==10){
            if (!totalLegalNumbers.contains(legalPhoneNumber)) {
                totalLegalNumbers.add(legalPhoneNumber);
            }
            legalPhoneNumber.clear();
        }

    }
}
