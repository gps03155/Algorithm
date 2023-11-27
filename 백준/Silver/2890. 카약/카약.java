import java.io.IOException;
import java.util.*;

public class Main {
    public static int getIndex(char cha) {
        switch (cha) {
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] board = new char[r][c];

        for (int i = 0; i < r; i++) {
            char[] line = sc.next().toCharArray();
            System.arraycopy(line, 0, board[i], 0, line.length);
        }

        Map<Integer, Integer> map = new TreeMap<>();
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < r; i++) {
            int count = 0;
            int index = 0;
            for (int j = c - 2; j >= 0; j--) {
                if (board[i][j] == '.') {
                    count++;
                }

                index = getIndex(board[i][j]);

                if (board[i][j] != '.') {
                    break;
                }
            }

            map.put(index, count);
            nums.add(count);
        }

        List<Integer> list = new ArrayList<>(nums);
        Collections.sort(list);

        Map<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < r; i++) {
            int index = 0;
            for (int j = c - 2; j >= 0; j--) {
                if (board[i][j] != '.') {
                    index = getIndex(board[i][j]);
                    break;
                }
            }

            if (index > 0) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).equals(map.get(index))) {
                        treeMap.put(index, j + 1);
                        break;
                    }
                }
            }
        }

        for (Integer value : treeMap.values()) {
            System.out.println(value);
        }

    }
}