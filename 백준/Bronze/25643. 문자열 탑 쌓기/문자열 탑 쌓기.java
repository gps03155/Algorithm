import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < n - 1; i++) {
            String a = arr[i];
            String b = arr[i + 1];
            boolean isComplete = false;

            for (int j = 0; j < m; j++) {
                if (a.substring(0, m - j).equals(b.substring(j, m))) {
                    isComplete = true;
                }
                if (a.substring(j, m).equals(b.substring(0, m - j))) {
                    isComplete = true;
                }
            }

            if (!isComplete) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}