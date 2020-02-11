package com.company;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    List<String> inputMass = new ArrayList<>();
    int oNumber = 0;

    Pair getTwo(String instr, int pos) {
        Pair ar = new Pair();
        instr = "<" + instr + ">";
        for (int i = pos + 1; i < instr.length(); i++) {
            if ((Character.isDigit(instr.charAt(i))) | instr.charAt(i) == '.') {
            } else {
                System.out.println("SecondNumber = " + instr.substring(pos + 1, i));
                ar.secondNumber = Float.valueOf(instr.substring(pos + 1, i));
                ar.secondPosition = i-2;
      //          System.out.println("ar[3] =" + pos);
                break;
            }
        }
        for (int j = pos - 1; j >= 0; j--) {
            if ((Character.isDigit(instr.charAt(j))) | instr.charAt(j) == '.') {
            } else {
                System.out.println("FirstNumber = " + instr.substring(j + 1, pos));
                ar.firstNumber = Float.valueOf(instr.substring(j + 1, pos));
                //          System.out.println("ar[2] =" + j);
                ar.firstPosition = j;
                break;
            }
        }
        return ar;
    }

    void calculate() {
        inputMass = FileRead.read("111.txt");
        String currentLine = "";
        float x = 0.0f;
        Pair out = new Pair();
        for (int i = 0; i < inputMass.size(); i++) {
            currentLine = inputMass.get(i);
            oNumber = 0;
            for (int j = 0; j < currentLine.length(); j++) {
                if ((Character.isDigit(currentLine.charAt(j))) | currentLine.charAt(j) == '.') {
                } else oNumber++;
            }

            for (int operationCount = 1; operationCount <= oNumber; operationCount++) {
                if (currentLine.indexOf('*') > 0) {
                    System.out.println("Входная строка : " + currentLine);
                    System.out.println("pos = " + currentLine.indexOf('*'));
                    out = getTwo(currentLine, currentLine.indexOf('*') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out.firstNumber * out.secondNumber;
                    System.out.println("Перемножение = " + x);
                    if (operationCount == oNumber) currentLine = String.valueOf(x);
                    else currentLine = currentLine.substring(0,out.firstPosition) + x + currentLine.substring((out.secondPosition + 1), currentLine.length());

                } else if (currentLine.indexOf('/') > 0) {
                    System.out.println("Входная строка : " + currentLine);
                    System.out.println("pos = " + currentLine.indexOf('/'));
                    out = getTwo(currentLine, currentLine.indexOf('/') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out.firstNumber / out.secondNumber;
                    System.out.println("Деление = " + x);
                    if (operationCount == oNumber) currentLine = String.valueOf(x);
                    else currentLine = currentLine.substring(0, out.firstPosition) + x + currentLine.substring((out.secondPosition + 1), currentLine.length());

                } else if (currentLine.indexOf('+') > 0) {
                    System.out.println("Входная строка : " + currentLine);
                    System.out.println("pos = " + currentLine.indexOf('+'));
                    out = getTwo(currentLine, currentLine.indexOf('+') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out.firstNumber + out.secondNumber;
                    System.out.println("Суммируем = " + x);
                    if (operationCount == oNumber) currentLine = String.valueOf(x);
                    else {
                        System.out.println("append : " +currentLine.substring((out.secondPosition + 1), currentLine.length()));
                        currentLine = currentLine.substring(0, out.firstPosition) + x + currentLine.substring((out.secondPosition + 1), currentLine.length());
                    }

                } else if (currentLine.indexOf('-') > 0) {
                    System.out.println("Входная строка : " + currentLine);
                    System.out.println("pos = " + currentLine.indexOf('-'));
                    out = getTwo(currentLine, currentLine.indexOf('-') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out.firstNumber - out.secondNumber;
                    System.out.println("Вычитаем = " + x);
                    if (operationCount == oNumber) currentLine = String.valueOf(x);
                    else currentLine = currentLine.substring(0, out.firstPosition) + x + currentLine.substring((out.secondPosition + 1), currentLine.length());

                }
                System.out.println("Результат = " + currentLine);
            }

        }

    }


}

