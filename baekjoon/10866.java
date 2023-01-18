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
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken().toLowerCase()) {
			case "push_front":
				deque.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				deque.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				System.out.println(deque.isEmpty()? -1 : deque.peekFirst());
				deque.pollFirst();
				break;
			case "pop_back":
				System.out.println(deque.isEmpty()? -1 : deque.peekLast());
				deque.pollLast();
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				System.out.println(deque.isEmpty()? 1 : 0);
				break;
			case "front":
				System.out.println(deque.isEmpty()? -1 : deque.peekFirst());
				break;
			case "back":
				System.out.println(deque.isEmpty()? -1 : deque.peekLast());
				break;
			}
		}
	}
}
