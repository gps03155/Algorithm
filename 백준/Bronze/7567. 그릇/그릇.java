import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char prev = s.charAt(0);
        int height = 10;
        for (int i = 1; i < s.length(); i++) {
            char cha = s.charAt(i);
            height += prev == cha ? 5 : 10;
            prev = cha;
        }

        System.out.println(height);
    }
}