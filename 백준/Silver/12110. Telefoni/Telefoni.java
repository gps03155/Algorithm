import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int[] phones = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            phones[i] = Integer.parseInt(st.nextToken());
        }

        int distance = 0, result = 0;
        for (int i = 0; i < n; i++) {
            // 0인 경우 최대 거리까지 증가
            if (phones[i] == 1) {
                distance = 0;
            }

            // 0에서 최대 거리까지 온 경우 전화기 설치
            else if (++distance == d) {
                result++;
                distance = 0;
            }
        }

        System.out.println(result);
    }
}