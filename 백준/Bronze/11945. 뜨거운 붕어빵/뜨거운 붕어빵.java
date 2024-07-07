import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        char[][] arr = new char[r + 1][c + 1];
        for (int i = 0; i < r; i++) {
            arr[i] = new StringBuilder(br.readLine()).reverse().toString().toCharArray();
        }

        for (int i = 0; i < r; i++) {
            StringBuilder sb = new StringBuilder();
            for (char aChar : arr[i]) {
                sb.append(aChar);
            }
            System.out.println(sb);
        }
    }
}