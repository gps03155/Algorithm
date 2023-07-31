import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int col = 1;

        while (row * col < n) {
            if (row > col) col++;
            else row++;
        }

        System.out.println(row + " " + col);
    }
}