import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int burger = Integer.parseInt(st.nextToken());
        int side = Integer.parseInt(st.nextToken());
        int drink = Integer.parseInt(st.nextToken());

        Integer[] burgers = new Integer[burger];
        Integer[] sides = new Integer[side];
        Integer[] drinks = new Integer[drink];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < burger; i++) {
            burgers[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < side; i++) {
            sides[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < drink; i++) {
            drinks[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(burgers, Collections.reverseOrder());
        Arrays.sort(sides, Collections.reverseOrder());
        Arrays.sort(drinks, Collections.reverseOrder());

        int size = Math.min(burger, Math.min(side, drink));
        int money = 0, discountMoney = 0;
        for (int i = 0; i < size; i++) {
            int price = 0;
            price += burgers[i];
            price += sides[i];
            price += drinks[i];
            money += price;
            discountMoney += (int) (0.9 * price);
        }

        int singleMoney = 0;
        for (int i = size; i < burgers.length; i++) {
            singleMoney += burgers[i];
        }
        for (int i = size; i < sides.length; i++) {
            singleMoney += sides[i];
        }
        for (int i = size; i < drinks.length; i++) {
            singleMoney += drinks[i];
        }

        money += singleMoney;
        discountMoney += singleMoney;

        System.out.println(money);
        System.out.println(discountMoney);
    }
}