import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> list = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            list.add(word);
            String reverse = new StringBuilder(word).reverse().toString();

            if (list.contains(word) && list.contains(reverse)) {
                System.out.println(word.length() + " " + word.charAt(word.length() / 2));
                return;
            }
        }
    }
}