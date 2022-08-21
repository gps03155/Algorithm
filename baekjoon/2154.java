import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		
		for(int i=1; i<=num; i++) {
			builder.append(i);
		}
		
		int addNum = num + 1;
		
		while(true) {
			int index = builder.toString().indexOf(String.valueOf(num));
			
			if(index > -1) {
				System.out.println(index + 1);
				break;
			}

			builder.append(addNum);
		}
	}
}
