import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] students = new String[n];
        for (int i = 0; i < n; i++) {
            students[i] = br.readLine();
        }

        for (int i = 0; i < m; i++) {
            String[] quries = br.readLine().split(" ");

            int count = 0;
            for (int j = 0; j < students.length; j++) {
                String[] arr = students[j].split(" ");
                boolean isPass = true;

                for (int k = 0; k < 3; k++) {
                    if (!"-".equals(quries[k]) && !quries[k].equals(arr[k])) {
                        isPass = false;
                    }
                }

                if (isPass) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}