import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Set<Long> aList = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            aList.add(Long.parseLong(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            aList.remove(Long.parseLong(st.nextToken()));
        }

        System.out.println(aList.size());
        if (!aList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Long r : aList) {
                sb.append(r).append(" ");
            }
            System.out.println(sb);
        }

    }
}