package com.company;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileRead {
    public static ArrayList read(String fileName) throws Exception {
        ArrayList str = new ArrayList();

        FileReader fr = new FileReader(fileName);
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()){
            str.add(scan.nextLine());
        }

        fr.close();
        return str;
    }
}
