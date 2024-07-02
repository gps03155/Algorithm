import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String pwd = br.readLine();
            boolean isPass = 6 <= pwd.length() && pwd.length() <= 9;
            sb.append(isPass ? "yes" : "no").append("\n");
        }

        System.out.println(sb);
    }
}