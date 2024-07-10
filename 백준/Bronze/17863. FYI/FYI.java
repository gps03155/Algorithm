import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String telephone = br.readLine();
        System.out.println(telephone.startsWith("555") ? "YES" : "NO");
    }
}