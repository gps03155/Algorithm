import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isValid(String mobis) {
        return mobis.contains("M") &&
                mobis.contains("O") &&
                mobis.contains("B") &&
                mobis.contains("I") &&
                mobis.contains("S");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(isValid(br.readLine()) ? "YES" : "NO");
    }
}