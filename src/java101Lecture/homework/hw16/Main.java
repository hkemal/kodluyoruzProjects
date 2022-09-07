package java101Lecture.homework.hw16;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20, 20, 30, 40};
        int[] frequency = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = visited;
                }
            }
            if (frequency[i] != visited)
                frequency[i] = count;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != visited)
                System.out.println(arr[i] + " sayısı " + frequency[i] + " kere tekrar edildi.");
        }
    }
}
