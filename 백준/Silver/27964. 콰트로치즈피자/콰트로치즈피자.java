import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> list = new HashSet<>();
        while (st.hasMoreTokens()) {
            String topping = st.nextToken();

            if (topping.endsWith("Cheese")) {
                list.add(topping);
            }
        }

        System.out.println(list.size() >= 4 ? "yummy" : "sad");
    }
}