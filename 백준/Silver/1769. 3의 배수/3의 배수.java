import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        long cnt = 0;

        while (num.length() > 1) {
            long sum = 0;
            for (String s : num.split("")) {
                sum += Long.parseLong(s);
            }
            num = String.valueOf(sum);
            cnt++;
        }

        System.out.println(cnt);
        System.out.println(Long.parseLong(num) % 3 == 0 ? "YES" : "NO");
    }
}