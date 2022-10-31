package java102lecture.A06InputOutputStreams.lecture_6_10_Output_Stream_Writer;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String data = "ĞŞİÜÇ";
        try {
            FileOutputStream fileOutput = new FileOutputStream("src/java102lecture/A06InputOutputStreams/lecture_6_10_Output_Stream_Writer/patika.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutput, StandardCharsets.UTF_8);
            outputStreamWriter.write(data);
            outputStreamWriter.close();
            fileOutput.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
