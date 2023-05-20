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
            if (milks[i] == next) {
                count++;
                next = (next + 1) % 3;
            }
        }

        System.out.println(count);
    }
}