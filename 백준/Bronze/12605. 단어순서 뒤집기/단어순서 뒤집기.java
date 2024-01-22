import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String[] arr = br.readLine().split(" ");
            for (int j = arr.length - 1; j >= 0; j--) {
                sb.append(arr[j]).append(" ");
            }
            System.out.printf("Case #%d: %s", i + 1, sb);
            System.out.println();
        }
    }
}