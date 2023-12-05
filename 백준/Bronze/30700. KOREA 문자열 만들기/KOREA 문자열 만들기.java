import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        char[] words = {'K', 'O', 'R', 'E', 'A'};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == words[count % 5]) {
                count++;
            }
        }
        System.out.println(count);
    }
}