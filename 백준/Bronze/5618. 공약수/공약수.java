import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 1; i <= arr[arr.length - 1]; i++) {
            boolean isMeasure = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i != 0) {
                    isMeasure = false;
                }
            }

            if (isMeasure) {
                System.out.println(i);
            }
        }
    }
}