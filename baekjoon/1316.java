import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.util.StringTokenizer;
import java.util.function.Predicate;
import java.util.stream.*;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int testCase = Integer.parseInt(st.nextToken());
		
		List<Character> list = new ArrayList<>();
		Boolean isGroup = false;
		int count = 0;

		for(int i=0;i<testCase; i++) {
			String word = br.readLine();
			
			list = new ArrayList<>();
			int prev = 0;
			
			for(int j=0;j<word.length();j++) {
				
				if(prev != word.charAt(j)) {
					if(!list.contains(word.charAt(j))) {
						list.add(word.charAt(j));
						isGroup = true;
					}
					else {
						isGroup = false;
                        break;
					}
				}
				
				prev = word.charAt(j);
			}

			count = isGroup? count+1 : count;
		}
		
		System.out.println(count);
    }
}
