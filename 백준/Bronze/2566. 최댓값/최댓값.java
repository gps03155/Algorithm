import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0, row = 1, col = 1;
        for (int i = 0; i < 9; i++) {
            String[] s = br.readLine().split(" ");

            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(s[j]);
                if (num > max) {
                    max = num;
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);
    }
}