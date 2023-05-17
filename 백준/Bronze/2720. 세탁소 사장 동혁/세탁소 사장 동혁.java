import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] moneys = {25, 10, 5, 1};
        int[][] answer = new int[t][4];
        for (int i = 0; i < t; i++) {
            int price = Integer.parseInt(br.readLine());

            int index = 0;
            while (price > 0) {
                if (price < moneys[index]) {
                    index++;
                    continue;
                }

                price -= moneys[index];
                answer[i][index]++;
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < answer[i].length; j++) {
                sb.append(answer[i][j]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }
}