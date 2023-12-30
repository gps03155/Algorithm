import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] rabbits = new int[46];
        rabbits[0] = 1;
        rabbits[1] = 1;
        for (int i = 2; i < 46; i++) {
            rabbits[i] = rabbits[i - 1] + rabbits[i - 2];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            sb.append(rabbits[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.println(sb);
    }
}