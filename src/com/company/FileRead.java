package com.company;

import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead {
    public static List<String> read(String fileName) {
        List<String> str = new ArrayList<>();
        //List<String> strings = Files.readAllLines(Paths.get("111.txt"));

        try (FileReader fr = new FileReader(String.valueOf(Paths.get(fileName)));
             Scanner scan = new Scanner(fr)) {

            while (scan.hasNextLine()){
                str.add(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Ошибка чтения файла.....");
        }
        return str;
    }
}
