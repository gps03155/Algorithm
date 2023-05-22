import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dis = new int[n];

        for (int i = 0; i < n; i++) {
            dis[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(dis);

        int sum = 0;
        for (int i = 0; i < dis.length - 1; i++) {
            sum += dis[i];
        }

        System.out.println(sum);
    }
}