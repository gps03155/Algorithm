import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
    		// 1. LinkedList
		List<Integer> num = new LinkedList<>();
		
		for(int i=1; i<n+1; i++) {
			num.add(i);
		}
		
		List<String> answer = new ArrayList<>();
		
		while(!num.isEmpty()) {
			for(int i=0; i<k; i++) {
				if(i == k-1) {
					answer.add(num.get(0).toString());
					num.remove(0);
				}
				else {
					num.add(num.remove(0));
				}
			}
		}
		
		System.out.println("<" + String.join(", ", answer) + ">");
    
    		// 2. Queue
    		Queue<Integer> queue = new LinkedList<>();
		List<String> answer2 = new ArrayList<>();
		
		for(int i=1; i<n+1; i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			for(int i=0;i<k-1;i++) {
				queue.offer(queue.poll());
			}
			
			answer2.add(queue.poll().toString());
		}
		
		System.out.println("<" + String.join(", ", answer2) + ">");
    }
}
