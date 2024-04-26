import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> groups = new HashSet<>();
        while (n-- > 0) {
            String word = br.readLine();
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            groups.add(String.valueOf(chars));
        }
        System.out.println(groups.size());
    }
}