import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long score = sc.nextLong();
        int p = sc.nextInt();

        if (n == 0) {
            System.out.println(1);
            return;
        }

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        if (n == p && score <= arr[arr.length - 1])
            System.out.print(-1);
        else {
            int rank = 1;
            for (int i = 0; i < arr.length; i++) {
                if (score < arr[i])
                    rank++;
                else
                    break;
            }
            System.out.print(rank);
        }
    }
}