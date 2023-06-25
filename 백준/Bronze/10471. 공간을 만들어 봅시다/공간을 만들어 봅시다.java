import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[p + 2];
        arr[0] = 0;
        arr[arr.length - 1] = w;

        for (int i = 0; i < p; i++) {
            arr[i + 1] = sc.nextInt();
        }

        Set<Integer> list = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                list.add(arr[i] - arr[j]);
            }
        }

        List<Integer> result = new ArrayList<>(list);
        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString());
    }
}