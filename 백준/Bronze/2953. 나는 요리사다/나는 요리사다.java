import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int people = 0;

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
            }

            if (sum > max) {
                max = sum;
                people = i + 1;
            }
        }

        System.out.println(people + " " + max);
    }
}