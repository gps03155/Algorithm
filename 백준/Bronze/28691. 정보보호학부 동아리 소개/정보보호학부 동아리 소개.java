import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, String> map = new HashMap<>() {{
        put("M", "MatKor");
        put("W", "WiCys");
        put("C", "CyKor");
        put("A", "AlKor");
        put("$", "$clear");
    }};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(map.get(br.readLine()));
    }
}