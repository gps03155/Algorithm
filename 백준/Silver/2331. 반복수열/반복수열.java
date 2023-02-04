import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int p = sc.nextInt();

        List<Long> list = new ArrayList<>();
        List<Long> repeatList = new ArrayList<>();

        list.add(a);

        while (true) {
            long num = 0;
            long prevNum = list.get(list.size() - 1);

            while (prevNum > 0) {
                num += Math.pow(prevNum % 10, p);
                prevNum /= 10;
            }

            if (list.contains(num)) {
                if (repeatList.contains(num)) {
                    break;
                }
                repeatList.add(num);
            }

            list.add(num);
        }

        list.removeAll(repeatList);
        System.out.println(list.size());
    }
}