import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(a.charAt(i)).append(b.charAt(i));
        }

        while (sb.length() > 2) {
            StringBuilder numBuilder = new StringBuilder();
            for (int i = 0; i < sb.length() - 1; i++) {
                int num = Character.getNumericValue(sb.charAt(i)) + Character.getNumericValue(sb.charAt(i + 1));
                numBuilder.append(num % 10);
            }
            sb = numBuilder;
        }
        System.out.printf("%2s", sb.append("\n"));
    }
}