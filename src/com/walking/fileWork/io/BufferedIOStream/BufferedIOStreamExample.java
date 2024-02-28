package com.walking.fileWork.io.BufferedIOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedIOStreamExample {
    public static void main(String[] args) {
        File inFile = new File("resources/test.txt");
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inFile))) {
            int data;
            while ((data = bis.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File ouFile = new File("resourses/newTeat.txt");
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(ouFile))) {
            byte[] arr = "Check BufferedOutputStream".getBytes();
            bos.write(arr);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Path path = Paths.get("resourses/newTeat.txt");
        try {
            Files.delete(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
