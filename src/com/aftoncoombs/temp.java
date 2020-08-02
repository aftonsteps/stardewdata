package com.aftoncoombs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class temp {
    private String filepath;
    private String data;
    static private Scanner scanner;

    public temp(String filepath) {
        try {
            File file = new File(filepath);
            this.scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                data = data + scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}