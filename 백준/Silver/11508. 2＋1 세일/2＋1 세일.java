import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if ((i + 1) % 3 == 0) {
                sum -= arr[i];
            }
        }

        System.out.println(sum);
    }
}