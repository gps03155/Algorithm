import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();

        seat = seat.replaceAll("S", "S*").replaceAll("LL", "LL*");
        seat = "*".concat(seat);

        int count = 0;
        for (int i = 0; i < seat.length(); i++) {
            if (seat.charAt(i) == '*') {
                count++;
            }
        }

        System.out.println(Math.min(n, count));
    }
}