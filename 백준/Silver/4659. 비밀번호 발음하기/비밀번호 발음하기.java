import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String pw = br.readLine();

            if ("end".equals(pw)) {
                break;
            }

            boolean isAcceptable = true;

            // 모음 단어
            if (!pw.contains("a") && !pw.contains("e") && !pw.contains("i") && !pw.contains("o") && !pw.contains("u")) {
                isAcceptable = false;
            }

            // 모음/자음 개수 체크
            for (int i = 0; i < pw.length() - 2; i++) {
                if (Arrays.asList('a', 'e', 'i', 'o', 'u').contains(pw.charAt(i)) &&
                        Arrays.asList('a', 'e', 'i', 'o', 'u').contains(pw.charAt(i + 1)) &&
                        Arrays.asList('a', 'e', 'i', 'o', 'u').contains(pw.charAt(i + 2))) {

                    isAcceptable = false;
                    break;
                }

                if (!Arrays.asList('a', 'e', 'i', 'o', 'u').contains(pw.charAt(i)) &&
                        !Arrays.asList('a', 'e', 'i', 'o', 'u').contains(pw.charAt(i + 1)) &&
                        !Arrays.asList('a', 'e', 'i', 'o', 'u').contains(pw.charAt(i + 2))) {

                    isAcceptable = false;
                    break;
                }
            }

            // 같은 글자 연속 2번 X
            for (int i = 0; i < pw.length() - 1; i++) {
                if (pw.charAt(i) == 'e' || pw.charAt(i) == 'o') {
                    continue;
                }

                if (pw.charAt(i) == pw.charAt(i + 1)) {
                    isAcceptable = false;
                    break;
                }
            }

            System.out.println("<" + pw + "> is" + (isAcceptable ? " " : " not ") + "acceptable.");
        }
    }
}