import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] nodes = { { 17, -1, -1 }, { 15, 13, 17 }, { 7, -1, -1 }, { 13, -1, -1 }, { 5, 3, 7 },
                { 3, -1, -1 }, { 10, 5, 15 } };
        int ans = findRoot(nodes);
        System.out.println(ans);
    }

    public static int findRoot(int[][] nodes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] rel : nodes) {
            int p = rel[0];
            int c1 = rel[1];
            int c2 = rel[2];
            map.put(c1, map.getOrDefault(c1, 0) + 1);
            map.put(c2, map.getOrDefault(c2, 0) + 1);
            if (!map.containsKey(p)) {
                map.put(p, 0);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 0) {
                return key;
            }
        }
        return -1;
    }
}