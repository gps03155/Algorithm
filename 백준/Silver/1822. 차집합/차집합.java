import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Set<Long> aList = new HashSet<>();
        Set<Long> bList = new HashSet<>();

        input(br, aList, bList);

        List<Long> result = new ArrayList<>();
        for (Long aLong : aList) {
            if (!bList.contains(aLong)) {
                result.add(aLong);
            }
        }
        System.out.println(result.size());
        if (!result.isEmpty()) {
            Collections.sort(result);
            StringBuilder sb = new StringBuilder();
            for (Long r : result) {
                sb.append(r).append(" ");
            }
            System.out.println(sb);
        }

    }

    private static void input(BufferedReader br, Set<Long> aList, Set<Long> bList) throws IOException {
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            aList.add(Long.parseLong(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            bList.add(Long.parseLong(st.nextToken()));
        }
    }
}