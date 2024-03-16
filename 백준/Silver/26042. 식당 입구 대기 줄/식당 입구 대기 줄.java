import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int size = 0;
        int minPeople = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 2) {
                queue.poll();
                continue;
            }

            int people = Integer.parseInt(st.nextToken());
            queue.offer(people);

            if (queue.size() >= size) {
                if (size == queue.size()) {
                    if (people < minPeople) {
                        minPeople = people;
                    }
                } else {
                    size = queue.size();
                    minPeople = people;
                }
            }
        }
        System.out.println(size + " " + minPeople);
    }
}