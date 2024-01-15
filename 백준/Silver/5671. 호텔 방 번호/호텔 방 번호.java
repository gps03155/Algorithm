import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        StringBuilder sb = new StringBuilder();
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int count = 0;
            for (int i = n; i <= m; i++) {
                int[] arr = new int[10];
                int num = i;
                boolean isRoom = true;
                while (num > 0) {
                    arr[num % 10]++;
                    if (arr[num % 10] > 1) {
                        isRoom = false;
                        break;
                    }
                    num /= 10;
                }

                if (isRoom) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}