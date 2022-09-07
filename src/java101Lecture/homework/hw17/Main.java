package java101Lecture.homework.hw17;

public class Main {
    public static void main(String[] args) {

        int m = 2, n = 3;
        int[][] arr = new int[m][n];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        int[][] newArr = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = arr[i][j];
                newArr[j][i] = temp;
            }
        }
        for (int[] item : newArr) {
            for (int innerItem : item) {
                System.out.print(innerItem + " ");
            }
            System.out.print("\n");
        }
    }
}
