import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> x = new HashMap<>();
        Map<Integer, Integer> y = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            int num2 = sc.nextInt();
            x.put(num, x.getOrDefault(num, 0) + 1);
            y.put(num2, y.getOrDefault(num2, 0) + 1);
        }

        int resultX = 0, resultY = 0;
        for (Map.Entry<Integer, Integer> entry : x.entrySet()) {
            if (entry.getValue() == 1) {
                resultX = entry.getKey();
                break;
            }
        }

        for (Map.Entry<Integer, Integer> entry : y.entrySet()) {
            if (entry.getValue() == 1) {
                resultY = entry.getKey();
                break;
            }
        }

        System.out.println(resultX + " " + resultY);
    }
}