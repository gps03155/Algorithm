import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] pizzas = new int[11];
        pizzas[1] = 0;
        pizzas[2] = 1;
        for (int i = 3; i <= n; i++) {
            pizzas[i] = pizzas[i - 1] + (i - 1);
        }
        System.out.println(pizzas[n]);
    }
}