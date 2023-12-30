import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] size = new long[81];
        size[1] = 4;
        size[2] = 6;
        for (int i = 3; i <= n; i++) {
            size[i] = size[i - 1] + size[i - 2];
        }

        System.out.println(size[n]);
    }
}