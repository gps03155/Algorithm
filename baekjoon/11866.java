import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}
		
		StringBuilder builder = new StringBuilder("<");
		
		while(!queue.isEmpty()) {
			for(int i=0; i<k; i++) {
				if(i == k - 1) {
					builder.append(queue.poll());
				}
				else {
					queue.offer(queue.poll());
				}
			}
			
			if(queue.isEmpty()) builder.append(">");
			else builder.append(", ");
		}
		
		System.out.println(builder.toString());
	}
}
