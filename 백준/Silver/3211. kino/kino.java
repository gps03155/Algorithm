import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] friends = new int[n];

        for (int i = 0; i < n; i++) {
            friends[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(friends);
        int max = 1;
        while (max <= n && friends[max - 1] + 1 > max) {
            max = friends[max - 1] + 1;
        }

        System.out.println(max);
    }
}