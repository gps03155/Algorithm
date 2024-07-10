import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String emoji = br.readLine();
        long underLineCount = emoji.chars().filter(m -> m == '_').count();
        System.out.println(emoji.length() + 2 + (underLineCount * 5));
    }
}