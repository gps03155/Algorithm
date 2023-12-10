import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            Stack<Long> prices = new Stack<>();

            String[] st = br.readLine().split(" ");
            for (int j = 0; j < n * 2; j++) {
                prices.add(Long.parseLong(st[j]));
            }

            List<Long> discountPrices = new ArrayList<>();
            while (!prices.isEmpty()) {
                long money = (long) (prices.pop() * 0.75);
                if (prices.contains(money)) {
                    discountPrices.add(money);
                    prices.remove(Long.valueOf(money));
                }
            }

            Collections.sort(discountPrices);

            System.out.println(String.format("Case #%d: %s", i + 1, discountPrices.stream().map(String::valueOf).collect(Collectors.joining(" "))));
        }
    }
}