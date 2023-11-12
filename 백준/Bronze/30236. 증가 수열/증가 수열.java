import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] nums = new int[num];
            for (int j = 0; j < num; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

            int min = 0;
            for (int j = 0; j < num; j++) {
                if (nums[j] == min + 1) {
                    min += 2;
                    continue;
                }

                min++;
            }
            System.out.println(min);
        }
    }
}