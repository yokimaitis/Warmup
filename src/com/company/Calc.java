package com.company;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    public static void calculate() {
        List<String> inputMass = new ArrayList<>();
        inputMass = FileRead.read("C:\\Users\\kostya.GOMODS\\IdeaProjects\\Warmup\\src\\com\\company\\111.txt");
        String numbers = "0123456789";
        String str = "";
        String tmp = "";
        for (int i = 0; i < 1; i++) {
            str = inputMass.get(i);

            for (int j = 0; j < str.length(); j++) {
                tmp = tmp + str.charAt(j);
                if (numbers.contains(tmp)) WLN.write("Это число..");
                tmp="";
            }

        }
    }
}
