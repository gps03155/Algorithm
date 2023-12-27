import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int people = Integer.parseInt(st.nextToken());
        int friend = Integer.parseInt(st.nextToken());

        List<Integer> peoples = new ArrayList<>();
        List<Integer> friends = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < people; i++) {
            peoples.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < friend; i++) {
            friends.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        for (int i = 0; i < friends.size(); i++) {
            if (!friends.contains(peoples.get(i))) {
                count++;
            }
        }

        System.out.println(count);
    }
}