package com.company;

public class Warmup {
    public static String stringTimes(String inStr, int n){
        String outStr="";
        for (int i = 0; i < n; i++) {
            outStr=outStr+inStr;
        }
    return outStr;
    }
    public static String doobleX(String instr){
        for (int i = 0; i < instr.length() ; i++) {
            if (instr.charAt(i) == 'x' && instr.charAt(i+1) == 'x') return "true";
        }
        return "false";
    }
}
