import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            int oneCount = 0, zeroCount = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j)) {
                    if (a.charAt(j) == '1') {
                        zeroCount++;
                    } else if (a.charAt(j) == '0') {
                        oneCount++;
                    }
                }
            }

            System.out.println(Math.max(zeroCount, oneCount));
        }
    }
}