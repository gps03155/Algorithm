import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, String> map = new HashMap<>() {{
        put("NLCS", "North London Collegiate School");
        put("BHA", "Branksome Hall Asia");
        put("KIS", "Korea International School");
        put("SJA", "St. Johnsbury Academy");
    }};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(map.get(br.readLine()));
    }
}