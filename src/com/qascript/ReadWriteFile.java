package com.qascript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWriteFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ajitp\\Desktop\\test.txt");
            FileInputStream fis = new FileInputStream(file);
//            int c =file.read();
            int c;
            while ((c=fis.read()) !=-1){
                System.out.println((char) c);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
