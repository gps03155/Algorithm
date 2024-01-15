import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int col = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            BigInteger[][] arr = new BigInteger[row][col];
            for (int j = 0; j < row; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < col; k++) {
                    arr[j][k] = new BigInteger(st.nextToken());
                }
            }

            BigInteger[] answer = new BigInteger[col];
            for (int j = 0; j < col; j++) {
                BigInteger value = BigInteger.ONE;
                for (int k = 0; k < row; k++) {
                    value = value.multiply(arr[k][j]);
                }
                answer[j] = value;
            }

            BigInteger max = answer[0];
            int maxCol = 0;
            for (int j = 1; j < answer.length; j++) {
                if (answer[j].compareTo(max) >= 0) {
                    maxCol = j;
                    max = answer[j];
                }
            }
            sb.append(maxCol + 1).append("\n");
        }
        System.out.println(sb);
    }
}