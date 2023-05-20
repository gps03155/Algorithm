import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] milks = new int[n];

        for (int i = 0; i < n; i++) {
            milks[i] = sc.nextInt();
        }

        int count = 0, next = 0;
        for (int i = 0; i < milks.length; i++) {
            if (milks[i] == 0 && milks[i] == next) {
                count++;
                next = 1;
            } else if (milks[i] == 1 && milks[i] == next) {
                count++;
                next = 2;
            } else if (milks[i] == 2 && milks[i] == next) {
                count++;
                next = 0;
            }
        }

        System.out.println(count);
    }
}