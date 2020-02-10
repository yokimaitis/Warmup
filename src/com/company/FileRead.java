package com.company;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileRead {
    public static ArrayList read() throws Exception {
        ArrayList str = new ArrayList();

        FileReader fr = new FileReader("c:\\Users\\kostya.GOMODS\\IdeaProjects\\Warmup\\src\\com\\company\\111.txt");
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()){
            str.add(scan.nextLine());
        }

        fr.close();
        return str;
    }
}
