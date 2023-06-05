import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = 0;
        for (int i = 1; i <= b; i++) {
            max = Math.max(Integer.parseInt(new StringBuilder(String.valueOf(a * i)).reverse().toString()), max);
        }

        System.out.println(max);
    }
}