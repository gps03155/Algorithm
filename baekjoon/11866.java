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
		StringBuilder builder = new StringBuilder("<");
		
		if(k == 1) {
			for(int i=1; i<=n; i++) {
				builder.append(i);
				
				if(i != n) {
					builder.append(", ");
				}
			}
			
			builder.append(">");
		}
		else {
			for(int i=1; i<=n; i++) {
				queue.offer(i);
			}
			
			int index = 0;
			
			while(!queue.isEmpty()) {
				if(index == k - 1) {
					builder.append(queue.poll());
					
					if(queue.isEmpty()) {
						builder.append(">");
						break;
					}
					builder.append(", ");
					index = 0;
				}
				
				queue.offer(queue.poll());
				index++;
			}
		}
		
		System.out.println(builder.toString());
	}
}
