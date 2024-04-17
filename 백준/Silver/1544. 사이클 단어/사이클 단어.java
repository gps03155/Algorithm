import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> cycles = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (!cycles.contains(word)) {
                for (int j = 0; j < word.length(); j++) {
                    String temp = word.substring(j) + word.substring(0, j);
                    cycles.add(temp);
                }
                count++;
            }
        }
        System.out.println(count);
    }
}