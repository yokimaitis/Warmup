package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        //WLN.write(RLN.read());

        ArrayList inputs = new ArrayList();

        WLN.write("StringTimes = " + Warmup.stringTimes("24e",3));
        WLN.write("doobleX = " + Warmup.doobleX("aaxxxa"));
        int x[] = {0,0,0,0,0,0,0,0,0,1,2,3};
        WLN.write(Warmup.array123(x));
        WLN.write(Warmup.altPairs("abrakadabra"));
        int y[] = {0,1,0,3,3,3,4,2};
        WLN.write(Warmup.noTripples(y));
        WLN.write(Warmup.frontTimes("ChoChoCho",2));
        int z[] = {0,4,5,9,3,2,9,9,9,0,9};
        WLN.write(Warmup.arrayCount9(z));
        WLN.write(Warmup.stringMatch("xxcaazz","xxbaaz"));
        WLN.write(Warmup.removeYak("asdfgyakfgfhh"));
        int l[] = {0,4,2,7,1,6,5};
        WLN.write(Warmup.has271(l));
        WLN.write(Warmup.countXX("xxxx"));
        WLN.write(Warmup.stringExplosion("Code"));
        WLN.write(Warmup.stringX("xAaxxxxbbxxVBx"));

        new Calc().calculate();
      //  List<String> strings = Files.readAllLines(Paths.get("111.txt"));
        }
}
