package com.company;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    private class Pair{
        float firstNumber;
        float secondNumber;
        int firstPosition;
        int secondPosition;
    }

    List<String> inputMass = new ArrayList<>();
    List<String> outputMass = new ArrayList<>();
    int operationNumber = 0;

    Pair getPair(String instr, int pos) {
        Pair numbers = new Pair();
        instr = "<" + instr + ">";
        for (int i = pos + 1; i < instr.length(); i++) {
            if ((Character.isDigit(instr.charAt(i))) | instr.charAt(i) == '.') {
            } else {
                System.out.println("SecondNumber = " + instr.substring(pos + 1, i));
                numbers.secondNumber = Float.valueOf(instr.substring(pos + 1, i));
                numbers.secondPosition = i-2;  //1 - добавленный "<", 2 - один символ до знака
      //          System.out.println("numbers[3] =" + pos);
                break;
            }
        }
        for (int j = pos - 1; j >= 0; j--) {
            if ((Character.isDigit(instr.charAt(j))) | instr.charAt(j) == '.') {
            } else {
                System.out.println("FirstNumber = " + instr.substring(j + 1, pos));
                numbers.firstNumber = Float.valueOf(instr.substring(j + 1, pos));
                //          System.out.println("numbers[2] =" + j);
                numbers.firstPosition = j;
                break;
            }
        }
        return numbers;
    }

    void calculate() {
        inputMass = FileRead.read("input.txt");
        outputMass=inputMass;
        String currentLine = "";
        float x = 0.0f;
        Pair out = new Pair();
        for (int i = 0; i < inputMass.size(); i++) {
            currentLine = inputMass.get(i);
            operationNumber = 0;
            for (int j = 0; j < currentLine.length(); j++) {
                if ((Character.isDigit(currentLine.charAt(j))) | currentLine.charAt(j) == '.') {
                } else operationNumber++;
            }

            for (int operationCount = 1; operationCount <= operationNumber; operationCount++) {
                if (currentLine.indexOf('*') > 0) {
                    System.out.println("Входная строка : " + currentLine);
                    System.out.println("pos = " + currentLine.indexOf('*'));
                    out = getPair(currentLine, currentLine.indexOf('*') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out.firstNumber * out.secondNumber;
                    System.out.println("Перемножение = " + x);
                    if (operationCount == operationNumber) currentLine = String.valueOf(x);
                    else currentLine = currentLine.substring(0,out.firstPosition) + x + currentLine.substring((out.secondPosition + 1), currentLine.length());

                } else if (currentLine.indexOf('/') > 0) {
                    System.out.println("Входная строка : " + currentLine);
                    System.out.println("pos = " + currentLine.indexOf('/'));
                    out = getPair(currentLine, currentLine.indexOf('/') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out.firstNumber / out.secondNumber;
                    System.out.println("Деление = " + x);
                    if (operationCount == operationNumber) currentLine = String.valueOf(x);
                    else currentLine = currentLine.substring(0, out.firstPosition) + x + currentLine.substring((out.secondPosition + 1), currentLine.length());

                } else if (currentLine.indexOf('+') > 0) {
                    System.out.println("Входная строка : " + currentLine);
                    System.out.println("pos = " + currentLine.indexOf('+'));
                    out = getPair(currentLine, currentLine.indexOf('+') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out.firstNumber + out.secondNumber;
                    System.out.println("Суммируем = " + x);
                    if (operationCount == operationNumber) currentLine = String.valueOf(x);
                    else {
                        System.out.println("append : " +currentLine.substring((out.secondPosition + 1), currentLine.length()));
                        currentLine = currentLine.substring(0, out.firstPosition) + x + currentLine.substring((out.secondPosition + 1), currentLine.length());
                    }

                } else if (currentLine.indexOf('-') > 0) {
                    System.out.println("Входная строка : " + currentLine);
                    System.out.println("pos = " + currentLine.indexOf('-'));
                    out = getPair(currentLine, currentLine.indexOf('-') + 1);  //+1 Потому что в getTwo добавляем '<'
                    x = out.firstNumber - out.secondNumber;
                    System.out.println("Вычитаем = " + x);
                    if (operationCount == operationNumber) currentLine = String.valueOf(x);
                    else currentLine = currentLine.substring(0, out.firstPosition) + x + currentLine.substring((out.secondPosition + 1), currentLine.length());

                }
                System.out.println("Результат = " + currentLine);
            }
            System.out.println(i);outputMass.set(i,outputMass.get(i)+"="+currentLine);

        }
        FileWrite.write("output.txt",outputMass);

    }


}

