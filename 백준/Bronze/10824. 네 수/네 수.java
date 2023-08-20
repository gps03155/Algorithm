import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();

        System.out.println(new BigInteger(a + b).add(new BigInteger(c + d)));
    }
}