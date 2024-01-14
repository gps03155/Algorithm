import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int g = Integer.parseInt(br.readLine());
            List<Integer> students = new ArrayList<>();
            for (int j = 0; j < g; j++) {
                students.add(Integer.parseInt(br.readLine()));
            }

            if (g == 1) {
                System.out.println(1);
                continue;
            }

            int m = 2;
            while (true) {
                List<Integer> rest = new ArrayList<>();
                for (int j = 0; j < students.size(); j++) {
                    int num = students.get(j) % m;
                    if (rest.contains(num)) {
                        break;
                    }
                    rest.add(num);
                }

                if (rest.size() == students.size()) {
                    System.out.println(m);
                    break;
                }

                m++;
            }
        }
    }
}