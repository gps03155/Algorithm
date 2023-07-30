import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static BigInteger calculator(BigInteger a, BigInteger b, String operator) {
        return operator.equals("*") ? a.multiply(b) : a.add(b);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        String operator = sc.next();
        BigInteger b = sc.nextBigInteger();

        System.out.println(calculator(a, b, operator));
    }
}