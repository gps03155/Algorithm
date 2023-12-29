import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] pens = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pens[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(pens, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < pens.length; i++) {
            sum += pens[i];
            if (sum >= m * k) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println("STRESS");
    }
}