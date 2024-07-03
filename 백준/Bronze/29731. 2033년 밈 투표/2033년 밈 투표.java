import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static final String[] promises = {
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "Never gonna stop"
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        Set<String> list = new HashSet<>(Arrays.asList(promises));

        while (t-- > 0) {
            String input = br.readLine();

            if (!list.contains(input)) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}