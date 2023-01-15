import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			if (k == 0)
				stack.pop();
			else
				stack.push(k);
		}

		Iterator<Integer> it = stack.iterator();
		
		long sum = 0;
		while(it.hasNext()) {
			sum += it.next();
		}
		
		System.out.println(sum);
	}
}
