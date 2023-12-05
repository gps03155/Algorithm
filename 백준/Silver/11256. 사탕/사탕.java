import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int j = 0; j < t; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(st.nextToken());
            int boxNum = Integer.parseInt(st.nextToken());
            Integer[] boxes = new Integer[boxNum];

            for (int i = 0; i < boxes.length; i++) {
                st = new StringTokenizer(br.readLine());
                boxes[i] = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }

            Arrays.sort(boxes, Collections.reverseOrder());

            int index = 0;
            while (candy > 0) {
                candy -= boxes[index];
                index++;
            }
            System.out.println(index);
        }
    }
}