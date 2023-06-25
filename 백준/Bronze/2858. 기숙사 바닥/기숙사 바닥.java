import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        int width = r + b;

        int max = 0;
        int min = 0;
        for (int i = 3; i <= width; i++) {
            for (int j = 3; j <= width; j++) {
                if (i * j > width) break;
                if (i * j == width) {
                    if (b == (i - 2) * (j - 2)) {
                        max = Math.max(i, j);
                        min = Math.min(i, j);
                        break;
                    }
                }
            }
        }

        System.out.println(max + " " + min);
    }
}