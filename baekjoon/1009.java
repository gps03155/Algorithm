import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			Integer a = Integer.parseInt(st.nextToken());
			Integer b = Integer.parseInt(st.nextToken());
			
			int num = 1;
			
			for(int j=0; j<b; j++) {
				num = (num * a) % 10;
				if(num == 0) num = 10;
			}
			
			System.out.println(num);
		}
		
    // 메모리 초과
//		Scanner sc = new Scanner(System.in);
//		
//		int test = sc.nextInt();
//		
//		for(int i=0; i<test; i++) {
//			BigInteger a = sc.nextBigInteger();
//			BigInteger b = sc.nextBigInteger();
//			
//			BigInteger data = a.pow(b.intValue());
//			
//			System.out.println(data.mod(new BigInteger("10")));
//		}
	}
}
