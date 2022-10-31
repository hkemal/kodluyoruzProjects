package java102lecture.A06InputOutputStreams.lecture_6_8_Print_Stream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        try {
            PrintStream output = new PrintStream("src/java102lecture/A06InputOutputStreams/lecture_6_8_Print_Stream/print.txt");
            output.print("123" + 123);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
