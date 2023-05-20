import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] minus = s.split("-");

        int answer = 0;
        for (int i = 0; i < minus.length; i++) {
            String[] plus = minus[i].split("\\+");

            int sum = 0;
            for (int j = 0; j < plus.length; j++) {
                sum += Integer.parseInt(plus[j]);
            }

            if (i == 0) answer += sum;
            else answer -= sum;
        }

        System.out.println(answer);
    }
}