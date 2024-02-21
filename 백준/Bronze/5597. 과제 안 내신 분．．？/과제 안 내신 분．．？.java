import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < 28; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 1; i <= 30; i++) {
            if (!nums.contains(i)) {
                System.out.println(i);
            }
        }
    }
}