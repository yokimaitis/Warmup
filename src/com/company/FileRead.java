package com.company;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead {
    public static List<String> read(String fileName) {
        List<String> str = new ArrayList<>();

        try { FileReader fr = new FileReader(fileName);
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
