import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[15][15];
        for (int i = 0; i < 15; i++) {
            arr[i] = br.readLine().replaceAll(" ", "").toCharArray();
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                switch (arr[i][j]) {
                    case 'w':
                        System.out.println("chunbae");
                        return;
                    case 'b':
                        System.out.println("nabi");
                        return;
                    case 'g':
                        System.out.println("yeongcheol");
                        return;
                }
            }
        }
    }
}