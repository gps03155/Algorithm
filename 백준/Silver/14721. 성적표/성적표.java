import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long getRss(int n, int a, int b, int[][] arr) {
        long rss = 0;
        for (int i = 0; i < n; i++) {
            long fx = arr[i][0] * a + b - arr[i][1];
            rss += fx * fx;
        }

        return rss;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        long min = Long.MAX_VALUE;
        int minA = 0, minB = 0;
        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                long rss = getRss(n, a, b, arr);
                if (min > rss) {
                    min = rss;
                    minA = a;
                    minB = b;
                }
            }
        }
        System.out.println(minA + " " + minB);
    }
}