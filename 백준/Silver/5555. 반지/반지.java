import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String ring = br.readLine();
            List<String> list = new ArrayList<>(Arrays.asList(ring.split("")));
            for (int j = 0; j < ring.length(); j++) {
                if (String.join("", list).contains(word)) {
                    count++;
                    break;
                }
                list.add(list.get(0));
                list.remove(0);
            }
        }
        System.out.println(count);
    }
}