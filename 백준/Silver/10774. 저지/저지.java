import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static List<String> getEqualOrBiggerSize(String size) {
        switch (size) {
            case "S":
                return Arrays.asList("S", "M", "L");
            case "M":
                return Arrays.asList("M", "L");
            case "L":
                return Arrays.asList("L");
        }

        return new ArrayList<>();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        String[] arr = new String[j + 1];
        for (int i = 0; i < j; i++) {
            arr[i + 1] = br.readLine();
        }

        int count = 0;
        for (int i = 0; i < a; i++) {
            String[] judge = br.readLine().split(" ");
            if (getEqualOrBiggerSize(judge[0]).contains(arr[Integer.parseInt(judge[1])])) {
                arr[Integer.parseInt(judge[1])] = "";
                count++;
            }
        }
        System.out.println(count);
    }
}