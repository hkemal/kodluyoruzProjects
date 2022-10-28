package java102lecture.A06InputOutputStreams.lecture_6_2_File_Class;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/java102lecture/A06InputOutputStreams/lecture_6_2_File_Class/patika.txt");
        try {
            //create file
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("Yeni Dosya Oluştu.");
            } else {
                System.out.println("Dosya Zaten Mevcut.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        //delete file
        new File("patika.txt").delete();

        //create file
        new File("patika/test").mkdir();
        new File("patika/dev").mkdirs();

        //list file names
        String[] fileList = new File("test").list();

        for(String str : fileList) {
            System.out.println(str);
        }
    }
}
