import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] bulb = br.readLine().split("");

        int count = 0;
        for (int i = 0; i < bulb.length; i++) {
            if ("Y".equals(bulb[i])) {
                for (int j = i; j < bulb.length; j += (i + 1)) {
                    bulb[j] = "N".equals(bulb[j]) ? "Y" : "N";
                }

                count++;
            }
        }

        boolean hasLight = false;
        for (String s : bulb) {
            if ("Y".equals(s)) {
                hasLight = true;
                break;
            }
        }

        System.out.println(hasLight ? -1 : count);
    }
}