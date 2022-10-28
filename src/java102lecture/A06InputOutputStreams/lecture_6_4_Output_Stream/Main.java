package java102lecture.A06InputOutputStreams.lecture_6_4_Output_Stream;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        String data = "Output Stream\nPatika Dev";
        try {
            FileOutputStream output = new FileOutputStream("src/java102lecture/A06InputOutputStreams/lecture_6_4_Output_Stream/patika.txt", true);
            byte[] dataBytes = data.getBytes();
            output.write(dataBytes);
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
