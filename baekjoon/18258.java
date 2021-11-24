import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		Deque<Integer> queue = new ArrayDeque<>();
		StringBuilder builder = new StringBuilder();
		
		for(int i=0; i<test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
						
			switch(st.nextToken().toLowerCase()) {
			case "push":
				queue.offerLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				builder.append(queue.isEmpty()? -1 : queue.pollFirst()).append("\n");
				break;
			case "size":
				builder.append(queue.size()).append("\n");
				break;
			case "empty":
				builder.append(queue.isEmpty()? 1 : 0).append("\n");
				break;
			case "front":
				builder.append(queue.isEmpty()? -1 : queue.peekFirst()).append("\n");
				break;
			case "back":
				builder.append(queue.isEmpty()? -1 : queue.peekLast()).append("\n");
			}
		}
		
		System.out.println(builder);
	}
}
