import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String n = Integer.toBinaryString(sc.nextInt());

            StringBuilder sb = new StringBuilder();
            for (int j = n.length() - 1; j >= 0; j--) {
                if (n.charAt(j) == '1') {
                    sb.append(n.length() - 1 - j).append(" ");
                }
            }

            System.out.println(sb.toString());
        }
    }
}