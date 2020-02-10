package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
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
        int z[] = {0,4,5,9,3,2,9,9,9,0,3};
        WLN.write(Warmup.arrayCount9(z));

//      inputs = FileRead.read("C:\\Users\\kostya.GOMODS\\IdeaProjects\\Warmup\\src\\com\\company\\111.txt");
//
//        for (int i = 0; i <inputs.size() ; i++) {
//            WLN.write(inputs.get(i));
//        }

    }
}
