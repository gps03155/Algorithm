import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> numList = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            numList.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(numList.size());
    }
}