import java.util.Scanner;

public class Main {
    public static int getRight(char start, char end) {
        int count = 0;
        int i = start;
        while (true) {
            if (i == end) {
                return count;
            }
            i++;
            if (i > 90) {
                i = 65;
            }
            count++;
        }
    }

    public static int getLeft(char start, char end) {
        int count = 0;
        int i = end;
        while (true) {
            if (start == i) {
                return count;
            }
            i--;
            if (i < 65) {
                i = 90;
            }
            count++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char prev = 'A';
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char cha = s.charAt(i);

            int rightTime = getRight(prev, cha);
            int leftTime = getLeft(cha, prev);

            sum += Math.min(rightTime, leftTime);
            prev = cha;
        }
        System.out.println(sum);
    }
}