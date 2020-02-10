package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead {
    public static List<String> read(String fileName) throws IOException {
        List<String> str = new ArrayList<>();

        //List<String> strings = Files.readAllLines(Paths.get("111.txt"));

        try { FileReader fr = new FileReader(String.valueOf(Paths.get(fileName)));
        Scanner scan = new Scanner(fr);


        while (scan.hasNextLine()){
            str.add(scan.nextLine());
        }
        fr.close();
        }
        catch (Exception e) {
            WLN.write("Ошибка чтения файла.....");
        }
        return str;
    }
}
