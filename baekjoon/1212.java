import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		code1.8진수 -> 2진수
		String oct = br.readLine();
		String[] code = {"000", "001", "010", "011", "100", "101", "110", "111", "1000", "1001"};
		StringBuilder builder = new StringBuilder();
		
		for(int i=0; i<oct.length(); i++) {
			builder.append(code[oct.charAt(i) - 48]);
		}
		
		String binary = builder.toString();
		if(binary.startsWith("0")) {
			int index = binary.indexOf("1");
			binary = index > -1? binary.substring(index) : "0";
		}
		
		System.out.println(binary);
		
//		code2. RunTimeException(NumberFormat)
//		int oct = Integer.parseInt(br.readLine(), 8);
//		String binary = Integer.toBinaryString(oct);
//		
//		System.out.println(binary);
	}
}
