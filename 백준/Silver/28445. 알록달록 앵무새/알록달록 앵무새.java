import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] father = br.readLine().split(" ");
        String[] mother = br.readLine().split(" ");

        List<String> names = new ArrayList<>();
        Collections.addAll(names, father);
        Collections.addAll(names, mother);

        Set<String> treeSet = new TreeSet<>();

        for (String name : names) {
            for (String name2 : names) {
                treeSet.add(new StringBuilder(name).append(" ").append(name2).toString());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : treeSet) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}