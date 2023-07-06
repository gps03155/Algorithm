import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] board = new char[r][c];

        for (int i = 0; i < r; i++) {
            board[i] = sc.next().toCharArray();
        }

        int[] counts = new int[5];
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                int count = 0;

                if (board[i][j] == '#' || board[i][j + 1] == '#' || board[i + 1][j] == '#' || board[i + 1][j + 1] == '#') {
                    continue;
                }

                if (board[i][j] == 'X') count++;
                if (board[i][j + 1] == 'X') count++;
                if (board[i + 1][j] == 'X') count++;
                if (board[i + 1][j + 1] == 'X') count++;

                counts[count]++;
            }
        }

        for (int count : counts) {
            System.out.println(count);
        }
    }
}