import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		int[] arr = new int[test];
		
		for(int i=0; i<test; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Boolean isArithmetic = true;
		
		if(Arrays.stream(arr).allMatch(m -> m % arr[0] == 0)) {
			isArithmetic = false;
		}
		
		int answer = 0;
		int last = arr[arr.length - 1];
		int secondLast = arr[arr.length - 2];
		
		if(isArithmetic) {
			answer = last + last - secondLast; 
		}
		else {
			answer = last * (last / secondLast);
		}
		
		System.out.println(answer);
	}
}
