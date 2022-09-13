import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = br.readLine();
		int test = Integer.parseInt(br.readLine());
		String[] teamNames = new String[test];
		
		for(int i=0; i<test; i++) {
			teamNames[i] = br.readLine();
		}
		
		Arrays.sort(teamNames);
		long max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i=0; i<teamNames.length; i++) {
			long L = name.chars().filter(m -> m == 'L').count() + teamNames[i].chars().filter(m -> m == 'L').count();
			long O = name.chars().filter(m -> m == 'O').count() + teamNames[i].chars().filter(m -> m == 'O').count();
			long V = name.chars().filter(m -> m == 'V').count() + teamNames[i].chars().filter(m -> m == 'V').count();
			long E = name.chars().filter(m -> m == 'E').count() + teamNames[i].chars().filter(m -> m == 'E').count();
			
			long percent = ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;
			
			if(percent > max) {
				max = percent;
				index = i;
			}
		}
		
		System.out.println(teamNames[index]);
	}
}
