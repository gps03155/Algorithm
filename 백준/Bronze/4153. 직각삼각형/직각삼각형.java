import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            if ("0 0 0".equals(input)) break;
            StringTokenizer st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int[] arr = new int[]{a, b, c};
            Arrays.sort(arr);

            System.out.println(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2] ? "right" : "wrong");
        }
    }
}