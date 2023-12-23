import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] solves = new int[11][2];
        for (int i = 0; i < 11; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            solves[i][0] = Integer.parseInt(st.nextToken());
            solves[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(solves, (o1, o2) -> o1[1] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);

        long sum = 0, penalty = 0;
        for (int i = 0; i < 11; i++) {
            sum += solves[i][0];
            penalty += sum + 20L * solves[i][1];
        }

        System.out.println(penalty);
    }
}