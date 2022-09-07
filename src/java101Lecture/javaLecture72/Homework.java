package java101Lecture.javaLecture72;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 7, 2, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[numbers.length];
        Arrays.sort(numbers);
        var ref = new Object() {
            int presentValue = numbers[0];
        };
        for (int i = 1; i < numbers.length; i++) {
            if (ref.presentValue == numbers[i] && !Arrays.stream(duplicate).anyMatch(item -> item == ref.presentValue) && ref.presentValue % 2 == 0) {
                System.out.println(ref.presentValue);
                duplicate[i] = ref.presentValue;
            }
            ref.presentValue = numbers[i];
        }
    }
}
