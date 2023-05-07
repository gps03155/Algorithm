import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Integer[] weights = new Integer[n];
        for (int i = 0; i < n; i++) {
            weights[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(weights, Collections.reverseOrder());

        int max = 0;
        int rope = 0, weight = weights[0];
        for (int j = 0; j < n; j++) {
            rope++;
            weight = Math.min(weight, weights[j]);

            if (weight * rope > max) {
                max = weight * rope;
            }
        }

        System.out.println(max);
    }
}