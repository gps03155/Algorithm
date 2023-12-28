import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < n; i++) {
            switch (br.readLine()) {
                case "1/2":
                    count1++;
                    break;
                case "1/4":
                    count2++;
                    break;
                case "3/4":
                    count3++;
            }
        }

        int pizza = 0;
        while (count1 > 0 || count2 > 0 || count3 > 0) {
            // 0.75 + 0.25 = 1
            if (count3 > 0) {
                count3--;
                if (count2 > 0) {
                    count2--;
                }
                pizza++;
            }

            // 0.5 + 0.5 = 1
            else if (count1 > 1) {
                count1 -= 2;
                pizza++;
            }

            // 0.5 + 0.25 + 0.25 = 1
            else if (count1 > 0) {
                count1--;
                if (count2 > 0) {
                    count2 -= 2;
                }
                pizza++;
            }

            // 0.25 * 4 = 1
            else {
                count2 -= 4;
                pizza++;
            }
        }

        System.out.println(pizza);
    }
}