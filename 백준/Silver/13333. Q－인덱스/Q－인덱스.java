import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int q = 0;
        for (int i = max; i > 0; i--) {
            int finalI = i;
            int[] temp = Arrays.stream(arr).filter(m -> m >= finalI).toArray();
            if (temp.length >= i) {
                q = i;
                break;
            }
        }
        System.out.println(q);
    }
}