import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> names = new HashSet<>();
        int ans = 0;
        while (n-- > 0) {
            String chat = br.readLine();

            if ("ENTER".equals(chat)) {
                ans += names.size();
                names.clear();
                continue;
            }
            names.add(chat);
        }
        System.out.println(ans + names.size());
    }
}