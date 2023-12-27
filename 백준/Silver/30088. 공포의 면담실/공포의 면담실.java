import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] departments = new int[n][1000000];

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int sum = 0;
            for (int j = 0; j < num; j++) {
                departments[i][j] = Integer.parseInt(st.nextToken());
                sum += departments[i][j];
            }
            list.add(sum);
        }

        Collections.sort(list);
        long result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += (n - i) * list.get(i);
        }

        System.out.println(result);
    }
}