package java102lecture.A06InputOutputStreams.lecture_6_13_Print_Writer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String data = "Java 102";
        PrintWriter printWriter = new PrintWriter("src/java102lecture/A06InputOutputStreams/lecture_6_13_Print_Writer/patika.txt");
        printWriter.print(data);
        printWriter.close();
    }
}
