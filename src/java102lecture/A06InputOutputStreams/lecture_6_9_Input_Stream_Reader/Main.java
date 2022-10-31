package java102lecture.A06InputOutputStreams.lecture_6_9_Input_Stream_Reader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("src/java102lecture/A06InputOutputStreams/lecture_6_9_Input_Stream_Reader/patika.txt");
            InputStreamReader inputReader = new InputStreamReader(fileInput, StandardCharsets.UTF_8);
            System.out.println(inputReader.getEncoding());
            int i = inputReader.read();
            while (i != -1) {
                System.out.print(Character.toString(i));
                i = inputReader.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
