import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long sqrt = (long) Math.sqrt(n);
        if (sqrt * sqrt < n) {
            sqrt++;
        }
        System.out.println(sqrt);
    }
}