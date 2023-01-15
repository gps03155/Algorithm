import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Deque<Integer> queue = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			String command = st.nextToken();

			switch (command) {
			case "push":
				queue.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				System.out.println(queue.isEmpty() ? -1 : queue.peekFirst());
				queue.pollFirst();
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				System.out.println(queue.isEmpty() ? 1 : 0);
				break;
			case "front":
				System.out.println(queue.isEmpty() ? -1 : queue.peekFirst());
				break;
			case "back":
				System.out.println(queue.isEmpty() ? -1 : queue.peekLast());
				break;
			}
		}
	}
}
