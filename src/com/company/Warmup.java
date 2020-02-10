package com.company;

public class Warmup {
    public static String stringTimes(String inStr, int n) {
        String outStr = "";
        for (int i = 0; i < n; i++) {
            outStr += inStr;
        }
        return outStr;
    }

    public static boolean doobleX(String inStr) {
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) == 'x' && inStr.charAt(i + 1) == 'x') return true;
        }
        return false;
    }

    public static String array123(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] == 1 && n[i + 1] == 2 && n[i + 2] == 3) return "true";
        }
        return "false";
    }

    public static String altPairs(String instr) {
        String out = "";
        out = out + instr.charAt(0) + instr.charAt(1) + instr.charAt(4) + instr.charAt(5) + instr.charAt(8) + instr.charAt(9);
        return out;
    }

    public static boolean noTripples(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] == n[i + 1] && n[i] == n[i + 2]) return true;
        }
        return false;
    }

    public static String frontTimes(String instr, int n) {
        String outstr = "";
        if (instr.length() < 3) outstr = instr.repeat(n);
        else outstr = instr.substring(0, 3).repeat(n);
        return outstr;
    }

    public static Integer arrayCount9(int in[]) {
        int x = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 9) x++;
        }
        return x;
    }

    public static Integer stringMatch(String instr1, String instr2) {
        int out = 0;
        for (int i = 0; i < instr1.length()-1; i++) {
            if (instr2.contains(instr1.substring(i, i + 2))) out++;
        }
        return out;
    }

}

