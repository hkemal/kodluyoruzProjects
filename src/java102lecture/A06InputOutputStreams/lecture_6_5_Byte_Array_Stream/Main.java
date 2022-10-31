package java102lecture.A06InputOutputStreams.lecture_6_5_Byte_Array_Stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 54, 66, 6, 12, 3};
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        ByteArrayInputStream inputWithOffset = new ByteArrayInputStream(bytes, 2, 4);
        System.out.println("Kullanılabilen byte sayısı : " + input.available());
        //input.skip(2);
        int i = input.read();
        while (i != -1) {
            System.out.println(i);
            i = input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        String data = "Java 102 dersleri";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            output.write(data.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
