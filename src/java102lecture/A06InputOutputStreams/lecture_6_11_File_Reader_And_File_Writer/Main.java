package java102lecture.A06InputOutputStreams.lecture_6_11_File_Reader_And_File_Writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("src/java102lecture/A06InputOutputStreams/lecture_6_11_File_Reader_And_File_Writer/patika.txt", StandardCharsets.UTF_8);
            int i = readFile.read();
            while (i != -1) {
                System.out.print(Character.toString(i));
                i = readFile.read();
            }
            readFile.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        String data = "ĞŞİÜÇ";
        try {
            FileWriter fileWriter = new FileWriter("src/java102lecture/A06InputOutputStreams/lecture_6_11_File_Reader_And_File_Writer/patika.txt", StandardCharsets.UTF_8);
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
