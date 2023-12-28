import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            List<Integer> priceList = new ArrayList<>();
            while (true) {
                int price = Integer.parseInt(br.readLine());

                if (price == 0) {
                    break;
                }
                priceList.add(price);
            }

            Collections.sort(priceList, Collections.reverseOrder());
            int sum = 0;
            for (int j = 0; j < priceList.size(); j++) {
                sum += 2 * Math.pow(priceList.get(j), j + 1);
            }

            int money = 5 * 1000000;
            System.out.println(sum > money ? "Too expensive" : sum);
        }
    }
}