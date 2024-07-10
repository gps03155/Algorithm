import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mbti = br.readLine();
        int t = Integer.parseInt(br.readLine());
        int count = 0;

        while (t-- > 0) {
            if (mbti.equals(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}