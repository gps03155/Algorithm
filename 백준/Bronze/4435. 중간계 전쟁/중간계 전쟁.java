import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] h = {1,2,3,3,4,10};
		int[] o = {1,2,2,2,3,5,10};
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Battle "+ (i+1) +": ");
			int totaln = 0;
			int totalo = 0;
			
			for(int j = 0; j < 6; j++)
				totaln += sc.nextInt() * h[j];
			for(int j = 0; j < 7; j++)
				totalo += sc.nextInt() * o[j];
			
			if(totaln < totalo)
				System.out.println("Evil eradicates all trace of Good");
			else if(totaln > totalo)
				System.out.println("Good triumphs over Evil");
			else
				System.out.println("No victor on this battle field");
		}

	}

}