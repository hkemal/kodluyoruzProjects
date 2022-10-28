package java102lecture.A06InputOutputStreams.lecture_6_3_Input_Stream;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            //File dosya = new File("patika.txt");
            //dosya.createNewFile();
            FileInputStream input = new FileInputStream("src/java102lecture/A06InputOutputStreams/lecture_6_3_Input_Stream/patika.txt");
            //int read = input.read();
            //while (read != -1) {
            //    System.out.print(Character.toString(read) + " : ");
            //    System.out.println(read);
            //    read = input.read();
            //}
            System.out.println("Kullanılabilir byte sayısı : " + input.available());
            //input.read();
            //input.read();
            //input.read();
            //input.read();
            input.skip(5);
            System.out.println("Kullanılabilir byte sayısı : " + input.available());

            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
