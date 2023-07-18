import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            sc.nextLine();
            int n = sc.nextInt();
            BigInteger sum = BigInteger.ZERO;
            for (int j = 0; j < n; j++) {
                sum = sum.add(sc.nextBigInteger());
            }

            System.out.println(sum.mod(new BigInteger(String.valueOf(n))).compareTo(BigInteger.ZERO) == 0 ? "YES" : "NO");
        }
    }
}