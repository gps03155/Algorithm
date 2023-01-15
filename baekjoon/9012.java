import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 1. Stack
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			Boolean isVPS = false;

			String[] psArr = br.readLine().split("");

			for (String ps : psArr) {
				if ("(".equals(ps)) {
					stack.push(ps);
				} else {
					if (stack.isEmpty()) {
						stack.push(ps);
						continue;
					}

					String prev = stack.peek();
					if ("(".equals(prev)) {
						stack.pop();
					}
				}
			}

			if (stack.isEmpty()) {
				isVPS = true;
			}

			stack.clear();
			System.out.println(isVPS ? "YES" : "NO");
		}
		
		// 2. replace
		for (int i = 0; i < n; i++) {
			String ps = br.readLine();
			
			while(ps.contains("()")) {
				ps = ps.replace("()", "");
			}
			
			System.out.println(ps.isEmpty()? "YES" : "NO");
		}
	}
}
