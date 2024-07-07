import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String input = br.readLine();

            if ("END".equals(input)) {
                break;
            }

            sb.append(new StringBuilder(input).reverse())
              .append("\n");
        }
        System.out.println(sb);
    }
}