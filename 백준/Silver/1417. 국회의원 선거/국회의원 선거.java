import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int dasom = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i < n; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }

        while (!queue.isEmpty() && dasom <= queue.peek()) {
            dasom++;
            count++;
            queue.add(queue.poll() - 1);
        }

        System.out.println(count);
    }
}