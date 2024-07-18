import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int getCount(String word, boolean includeY) {
        int count = 0;
        char[] charArray = word.toCharArray();
        for (char c : charArray) {
            switch (c) {
                case 'a':
                case 'e':
                case 'o':
                case 'i':
                case 'u':
                    count++;
                    break;
                case 'y':
                    if (includeY) {
                        count++;
                    }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(getCount(word, false) + " " + getCount(word, true));
    }
}