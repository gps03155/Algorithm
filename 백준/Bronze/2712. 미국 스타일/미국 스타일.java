import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static Map<Double, String> getUnit(double num, String unit) {
        Map<Double, String> map = new HashMap<>();

        switch (unit) {
            case "kg":
                map.put(num * 2.2046, "lb");
                break;
            case "l":
                map.put(num * 0.2642, "g");
                break;
            case "lb":
                map.put(num * 0.4536, "kg");
                break;
            case "g":
                map.put(num * 3.7854, "l");
                break;
        }

        return map;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();

            Map<Double, String> map = getUnit(num, unit);
            for (Map.Entry<Double, String> entry : map.entrySet()) {
                System.out.println(String.format("%.4f %s", entry.getKey(), entry.getValue()));
            }
        }
    }
}