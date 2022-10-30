package java102lecture.A06InputOutputStreams.lecture_6_12_Buffered_Reader_And_Buffered_Writer;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("src/java102lecture/A06InputOutputStreams/lecture_6_12_Buffered_Reader_And_Buffered_Writer/patika.txt", StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(readFile);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            readFile.close();
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        String data = "ĞŞİÜÇ";
        try {
            FileWriter fileWriter = new FileWriter("src/java102lecture/A06InputOutputStreams/lecture_6_12_Buffered_Reader_And_Buffered_Writer/patika.txt", StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
