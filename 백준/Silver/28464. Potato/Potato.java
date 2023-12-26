import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(nums);
        Deque<Integer> deque = new ArrayDeque<>(nums);
        int seongwoo = 0, park = 0;
        while (!deque.isEmpty()) {
            park += deque.pollLast();

            if (deque.isEmpty()) {
                break;
            }

            seongwoo += deque.pollFirst();
        }

        System.out.println(seongwoo + " " + park);
    }
}