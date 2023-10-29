import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] clothes = new int[n];
        for (int i = 0; i < n; i++) {
            clothes[i] = sc.nextInt();
        }

        int u = sc.nextInt();
        int d = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (clothes[i] == 3) {
                if (u > 0) {
                    u--;
                    sb.append("U");
                }
                if (d > 0) {
                    d--;
                    sb.append("D");
                }
            } else if (clothes[i] == 1) {
                if (u > 0) {
                    u--;
                    sb.append("U");
                }
            } else if (clothes[i] == 2) {
                if (d > 0) {
                    d--;
                    sb.append("D");
                }
            }

            if (u == 0 && d == 0) {
                break;
            }
        }

        if (u == 0 && d == 0) {
            System.out.println("YES");
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}