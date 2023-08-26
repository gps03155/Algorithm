import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int lower = 0, upper = 0, number = 0, space = 0;
            for (int i = 0; i < s.length(); i++) {
                char cha = s.charAt(i);

                if (65 <= cha && cha <= 90) {
                    upper++;
                } else if (97 <= cha && cha <= 122) {
                    lower++;
                } else if (48 <= cha && cha <= 57) {
                    number++;
                } else space++;
            }

            System.out.println(lower + " " + upper + " " + number + " " + space);

        }
    }
}