import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final String word = "WelcomeToSMUPC";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        StringBuilder totalWord = new StringBuilder(word);
        while (totalWord.length() <= size) {
            totalWord.append(word);
        }

        System.out.println(totalWord.charAt(size - 1));
    }
}