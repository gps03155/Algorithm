import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            int[] arr = new int[num + 2];
            arr[1] = 1;

            for (int j = 2; j < arr.length; j++) {
                arr[j] = arr[j - 1] + j;
            }

            long sum = 0;
            for (int k = 1; k <= num; k++) {
                sum += k * arr[k + 1];
            }

            System.out.println(sum);
        }
    }
}