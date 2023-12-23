import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split("");
        String[] b = br.readLine().split("");

        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (!a[i].equals(b[i])) {
                if (a[i + 1].equals(b[i + 1])) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}