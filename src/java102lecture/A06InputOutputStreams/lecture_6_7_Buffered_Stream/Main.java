package java102lecture.A06InputOutputStreams.lecture_6_7_Buffered_Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("src/java102lecture/A06InputOutputStreams/lecture_6_7_Buffered_Stream/patika.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInput);
            int i = bufferedInputStream.read();
            while (i != -1) {
                System.out.print(Character.toString(i));
                i = bufferedInputStream.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String data = "Java 102 patika";
        try {
            FileOutputStream fileOutput = new FileOutputStream("src/java102lecture/A06InputOutputStreams/lecture_6_7_Buffered_Stream/patikaOut.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutput);
            byte[] dataBytes = data.getBytes();
            bufferedOutputStream.write(dataBytes);
            bufferedOutputStream.close();
            fileOutput.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
