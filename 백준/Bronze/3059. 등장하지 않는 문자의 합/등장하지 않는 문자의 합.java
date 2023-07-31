import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            boolean[] alpha = new boolean[26];
            String s = sc.next();

            for (char cha : s.toCharArray()) {
                if (!alpha[cha - 65]) {
                    alpha[cha - 65] = true;
                }
            }

            int sum = 0;
            for (int j = 0; j < alpha.length; j++) {
                if (!alpha[j]) {
                    sum += j + 65;
                }
            }

            System.out.println(sum);
        }
    }
}