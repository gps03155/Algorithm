import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            int num = i;
            int sum = num;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (!sumList.contains(i)) {
                list.add(i);
            }
            sumList.add(sum);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer).append("\n");
        }
        System.out.println(sb);
    }
}