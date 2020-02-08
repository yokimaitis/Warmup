package com.company;

public class Warmup {
    public static String stringTimes(String inStr, int n){
        String outStr="";
        for (int i = 0; i < n; i++) {
            outStr=outStr+inStr;
        }
    return outStr;
    }
    public static String doobleX(String inStr) {
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) == 'x' && inStr.charAt(i + 1) == 'x') return "true";
        }
        return "false";
    }

    public static String array123(int n[]){
        for (int i = 0; i < n.length-1 ; i++){
            if (n[i]==1 && n[i+1]==2 && n[i+2]==3) return "true";
        }
        return "false";
        }
}
