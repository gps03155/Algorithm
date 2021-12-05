import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0; i<test; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) System.out.println(queue.isEmpty()? 0 : queue.poll());
			else queue.offer(num);
		}
	}
}
