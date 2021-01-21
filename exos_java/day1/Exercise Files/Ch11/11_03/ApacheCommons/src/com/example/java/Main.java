package com.example.java;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File sourceFile = new File("files/loremipsum.txt");
        File targetFile = new File("files/target.txt");
        try {
            FileUtils.copyFile(sourceFile, targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
