package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //WLN.write(RLN.read());

        WLN.write("StringTimes = " + Warmup.stringTimes("24e",3));
        WLN.write("doobleX = " + Warmup.doobleX("aaxxxa"));
        int x[] = {0,0,0,0,0,0,0,0,0,1,2,3};
        WLN.write(Warmup.array123(x));
        WLN.write(Warmup.altPairs("abrakadabra"));
        int y[] = {0,1,0,3,3,3,4,2};
        WLN.write(Warmup.noTripples(y));
    }
}
