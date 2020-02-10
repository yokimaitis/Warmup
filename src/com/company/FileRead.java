package com.company;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class FileRead {
    public static String[] read() throws Exception {
        String ar[] = new String[100];
        FileReader fr = new FileReader("c:\\Users\\kostya.GOMODS\\IdeaProjects\\Warmup\\src\\com\\company\\111.txt");
        Scanner scan = new Scanner(fr);
        String g = scan.nextLine();
        ar[0] = g;
        WLN.write(ar.length);
        fr.close();

        return ar;
    }

}
