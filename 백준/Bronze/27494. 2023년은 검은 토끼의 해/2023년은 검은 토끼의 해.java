import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isTrue(String n) {
        for (int m = 0; m < n.length(); m++) {
            if (n.charAt(m) == '2') {
                for (int j = m + 1; j < n.length(); j++) {
                    if (n.charAt(j) == '0') {
                        for (int k = j + 1; k < n.length(); k++) {
                            if (n.charAt(k) == '2') {
                                for (int l = k + 1; l < n.length(); l++) {
                                    if (n.charAt(l) == '3') {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= t; i++) {
            String n = String.valueOf(i);
            if (n.length() >= 4 && isTrue(n)) {
                count++;
            }
        }

        System.out.println(count);
    }
}