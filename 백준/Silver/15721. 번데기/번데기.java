import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());


        int n = 0, count = 0, people = 0;
        while (true) {
            n++;
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);
            list.add(0);
            list.add(1);

            for (int i = 1; i <= n + 1; i++) {
                list.add(0);
            }
            for (int i = 1; i <= n + 1; i++) {
                list.add(1);
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == d) {
                    count++;
                    if (count == t) {
                        System.out.println(people);
                        return;
                    }
                }

                people++;
                people %= a;
            }
        }
    }
}