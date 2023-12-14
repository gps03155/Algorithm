import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        char[] arr = {'U', 'C', 'P', 'C'};
        char[] words = word.toCharArray();

        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (index >= 4) {
                break;
            }

            if (words[i] == arr[index % 4]) {
                sb.append(words[i]);
                index++;
            }
        }
        System.out.println("UCPC".equals(sb.toString()) ? "I love UCPC" : "I hate UCPC");
    }
}