package com.company;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    public static void calculate() {
        List<String> inputMass = new ArrayList<>();
        inputMass = FileRead.read("C:\\Users\\kostya.GOMODS\\IdeaProjects\\Warmup\\src\\com\\company\\111.txt");
        String str = "";
        for (int i = 0; i < 1; i++) {
            str = inputMass.get(i);
            for (int j = 0; j < str.length(); j++) {
                if (Character.isDigit(str.charAt(j))) WLN.write("Это число..");
            }

        }
    }
}
