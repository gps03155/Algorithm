import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();

            boolean isFBI = s.contains("FBI") && s.length() <= 10 && s.matches(".*[A-Z|0-9|-].*");
            if (isFBI) {
                sb.append(i + 1).append(" ");
            }
        }

        System.out.println(sb.length() == 0 ? "HE GOT AWAY!" : sb.toString());
    }
}