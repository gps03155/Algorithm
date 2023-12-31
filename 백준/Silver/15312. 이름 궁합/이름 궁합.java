import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = new int[]{3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        String a = br.readLine();
        String b = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            sb.append(score[a.charAt(i) - 'A']);
            sb.append(score[b.charAt(i) - 'A']);
        }

        while (sb.length() > 2) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < sb.length() - 1; i++) {
                int num = Character.getNumericValue(sb.charAt(i)) + Character.getNumericValue(sb.charAt(i + 1));
                temp.append(num % 10);
            }
            sb = temp;
        }

        System.out.println(sb);
    }
}