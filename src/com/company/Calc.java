package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calc {
    List<String> inputMass = new ArrayList<>();
    int oNumber=0;

    void calculate() {
        inputMass = FileRead.read("111.txt");
        String str = "";
        for (int i = 0; i < 1; i++) {
            str = inputMass.get(i);
            for (int j = 0; j < str.length(); j++) {
                if (Character.isDigit(str.charAt(j))) WLN.write("Это число..");
                else oNumber++;

            }

        }
    }
}
