package java102lecture.A06InputOutputStreams.lecture_6_6_Serialization_And_Object_Output_Stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        Car audiA3 = new Car("Audi", "A3");

        /*
        try {
            FileOutputStream outputFile = new FileOutputStream("src/java102lecture/A06InputOutputStreams/lecture_6_6_Serialization_And_Object_Output_Stream/araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(audiA3);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
         */
        try {
            FileInputStream inputFile = new FileInputStream("src/java102lecture/A06InputOutputStreams/lecture_6_6_Serialization_And_Object_Output_Stream/araba.txt");
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);
            Car newCar = (Car) inputStream.readObject();
            System.out.println(newCar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
