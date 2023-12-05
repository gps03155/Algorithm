import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            String s = st.nextToken();
            String t = st.nextToken();

            boolean hasWord = true;
            for (int i = 0; i < s.length(); i++) {
                int index = t.indexOf(s.charAt(i));
                if (index < 0) {
                    hasWord = false;
                    break;
                }

                t = t.substring(index + 1);
            }
            System.out.println(hasWord ? "Yes" : "No");
        }
    }
}