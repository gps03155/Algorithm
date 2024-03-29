import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        List<String> yonsei = new ArrayList<>(Arrays.asList("Y", "O", "N", "S", "E", "I"));
        List<String> korea = new ArrayList<>(Arrays.asList("K", "O", "R", "E", "A"));

        for (String str : s.split("")) {
            if (str.equals(yonsei.get(0))) {
                yonsei.remove(str);
            }
            if (str.equals(korea.get(0))) {
                korea.remove(str);
            }

            if (yonsei.isEmpty()) {
                System.out.println("YONSEI");
                return;
            }
            if (korea.isEmpty()) {
                System.out.println("KOREA");
                return;
            }
        }
    }
}