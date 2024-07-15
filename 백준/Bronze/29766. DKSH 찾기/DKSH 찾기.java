import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        long count = (word.length() - word.replaceAll("DKSH", "").length()) / 4;
        System.out.println(count);
    }
}