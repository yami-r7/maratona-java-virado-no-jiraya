package io.test;

// File
// FileWriter
// FileReader
// BufferedWrite
// BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O DevDojo é o melhor curso do Brasil\nCurso Maratona Java");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
