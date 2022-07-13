import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String l = st.nextToken();
		
		List<Integer> answerList = new ArrayList<>();
		
		int i = 0;
		while(answerList.size() < n) {
			i++; 
			
			if(String.valueOf(i).contains(l)) {
				continue;
			}
			
			answerList.add(i);
		}
		
		System.out.println(Collections.max(answerList));
	}
}
