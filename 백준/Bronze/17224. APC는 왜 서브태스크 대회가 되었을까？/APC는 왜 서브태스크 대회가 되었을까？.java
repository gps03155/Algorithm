import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int k = sc.nextInt();

        int easyCount = 0, hardCount = 0;
        for (int i = 0; i < n; i++) {
            int easy = sc.nextInt();
            int hard = sc.nextInt();

            if (hard <= l) {
                hardCount++;
            }

            if (easy <= l) {
                easyCount++;
            }
        }

        int solved = 0;
        int score = 0;

        for (int i = 0; i < hardCount; i++) {
            if (solved >= k) {
                break;
            }
            solved++;
            score += 140;
        }

        easyCount -= solved;
        for (int i = 0; i < easyCount; i++) {
            if (solved >= k) {
                break;
            }

            solved++;
            score += 100;
        }

        System.out.println(score);
    }
}