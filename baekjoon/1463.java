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
		int x = Integer.parseInt(br.readLine());
		
		int[] dynamic = new int[x+1];
		
		for(int i=2; i<=x; i++) {
			dynamic[i] = dynamic[i-1] + 1;
			
			if(i % 2 == 0) {
				dynamic[i] = Math.min(dynamic[i], dynamic[i/2] + 1);
			}
			
			if(i % 3 == 0) {
				dynamic[i] = Math.min(dynamic[i], dynamic[i/3] + 1);
			}
		}
		
		System.out.println(dynamic[x]);
    }
}
