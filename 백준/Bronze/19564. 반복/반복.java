import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] chars = s.toCharArray();

        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] <= chars[i - 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}