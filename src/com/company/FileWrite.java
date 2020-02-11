package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWrite {


    public static void write(String fileName, List<String> str) {

        //Files.write(Paths.get("demo.txt"), lines, StandardOpenOption.CREATE);

        FileWriter nFile;

        try {
            nFile = new FileWriter(fileName);
            for (int i = 0; i < str.size(); i++) {
                nFile.write(str.get(i) + "\n");
            }
            nFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
