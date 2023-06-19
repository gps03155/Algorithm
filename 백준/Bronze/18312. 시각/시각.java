import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String k = sc.next();

        int hour = n, minute = 60, second = 60;
        int count = 0;

        for (int i = 0; i <= hour; i++) {
            for (int j = 0; j < minute; j++) {
                for (int m = 0; m < second; m++) {
                    if (String.format("%02d", i).contains(k) ||
                            String.format("%02d", j).contains(k) ||
                            String.format("%02d", m).contains(k)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}