package com.company;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    List<String> inputMass = new ArrayList<>();
    int oNumber = 0;

    float[] getTwo(String instr, int pos) {
        float[] ar = new float[4];
        instr = "<" + instr + ">";
        for (int i = pos + 1; i < instr.length(); i++) {
            if ((Character.isDigit(instr.charAt(i))) | instr.charAt(i) == '.') {
            } else {
                System.out.println("SecondNumber = " + instr.substring(pos + 1, i));
                ar[1] = Float.valueOf(instr.substring(pos + 1, i));
                ar[3] = i-2;
                System.out.println("ar[3] =" + pos);
                break;
            }
        }
        for (int j = pos - 1; j >= 0; j--) {
            if ((Character.isDigit(instr.charAt(j))) | instr.charAt(j) == '.') {
            } else {
                System.out.println("FirstNumber = " + instr.substring(j + 1, pos));
                ar[0] = Float.valueOf(instr.substring(j + 1, pos));
                //          System.out.println("ar[2] =" + j);
                ar[2] = j;
                break;
            }
        }
        return ar;
    }

    void calculate() {
        inputMass = FileRead.read("111.txt");
        String str = "";
        float x = 0.0f;
        float[] out = new float[4];
        for (int i = 0; i < 1; i++) {
            str = inputMass.get(i);
            oNumber = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((Character.isDigit(str.charAt(j))) | str.charAt(j) == '.') {
                } else oNumber++;
            }

            for (int xOper = 1; xOper <= oNumber; xOper++) {
                if (str.indexOf('*') > 0) {
                    System.out.println("Входная строка : " + str);
                    System.out.println("pos = " + str.indexOf('*'));
                    out = getTwo(str, str.indexOf('*') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out[0] * out[1];
                    System.out.println("Перемножение = " + x);
                    if (xOper == oNumber) str = String.valueOf(x);
                    else str = str.substring(0, (int) out[2]) + x + str.substring((int) (out[3] + 1), str.length());

                } else if (str.indexOf('/') > 0) {
                    System.out.println("Входная строка : " + str);
                    System.out.println("pos = " + str.indexOf('/'));
                    out = getTwo(str, str.indexOf('/') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out[0] / out[1];
                    System.out.println("Деление = " + x);
                    if (xOper == oNumber) str = String.valueOf(x);
                    else str = str.substring(0, (int) out[2]) + x + str.substring((int) (out[3] + 1), str.length());

                } else if (str.indexOf('+') > 0) {
                    System.out.println("Входная строка : " + str);
                    System.out.println("pos = " + str.indexOf('+'));
                    out = getTwo(str, str.indexOf('+') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out[0] + out[1];
                    System.out.println("Суммируем = " + x);
                    if (xOper == oNumber) str = String.valueOf(x);
                    else {
                        System.out.println("append : " +str.substring((int) (out[3] + 1), str.length()));
                        str = str.substring(0, (int) out[2]) + x + str.substring((int) (out[3] + 1), str.length());
                    }

                } else if (str.indexOf('-') > 0) {
                    System.out.println("Входная строка : " + str);
                    System.out.println("pos = " + str.indexOf('-'));
                    out = getTwo(str, str.indexOf('-') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out[0] - out[1];
                    System.out.println("Вычитаем = " + x);
                    if (xOper == oNumber) str = String.valueOf(x);
                    else str = str.substring(0, (int) out[2]) + x + str.substring((int) (out[3] + 1), str.length());

                }
                System.out.println("Результат = " + str);
            }

        }

    }


}

