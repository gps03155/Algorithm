import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int cnt = 0;
        while(a.contains(b)) {
            a = a.replaceFirst(b, " ");
            cnt++;
        }

        System.out.println(cnt);
    }
}