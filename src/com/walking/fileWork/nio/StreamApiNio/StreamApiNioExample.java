package com.walking.fileWork.nio.StreamApiNio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StreamApiNioExample {
    public static void main(String[] args) {
        Path path = Paths.get("resourses");
        try (var stream = Files.list(path)) {
            stream.forEach(fileName -> System.out.println("File - " + fileName));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
