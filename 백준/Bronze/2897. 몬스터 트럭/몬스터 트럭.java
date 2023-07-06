import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        String[][] board = new String[r][c];

        for (int i = 0; i < r; i++) {
            String[] arr = sc.next().split("");
            for (int j = 0; j < c; j++) {
                board[i][j] = arr[j];
            }
        }

        int[] counts = new int[5];
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                int count = 0;

                if ("#".equals(board[i][j]) ||
                        "#".equals(board[i][j + 1]) ||
                        "#".equals(board[i + 1][j]) ||
                        "#".equals(board[i + 1][j + 1])) {
                    continue;
                }

                if ("X".equals(board[i][j])) {
                    count++;
                }

                if ("X".equals(board[i + 1][j])) {
                    count++;
                }

                if ("X".equals(board[i][j + 1])) {
                    count++;
                }

                if ("X".equals(board[i + 1][j + 1])) {
                    count++;
                }

                counts[count]++;
            }
        }

        for (int count : counts) {
            System.out.println(count);
        }
    }
}