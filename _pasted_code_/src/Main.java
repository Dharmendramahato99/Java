import java.util.*;

public class Main {
    public static int buildXOR(int node, ArrayList<Integer>[] adj, boolean[] vis, HashMap<Integer, Integer> mp) {
        vis[node] = true;
        int x = 0;
        for (int it : adj[node]) {
            if (!vis[it]) {
                int cur = buildXOR(it, adj, vis, mp) ^ it;
                x ^= cur;
                mp.put(cur, mp.getOrDefault(cur, 0) + 1);
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
        }
        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
        }
        boolean[] vis = new boolean[n + 1];
        int xorr = buildXOR(1, adj, vis, mp) ^ 1;
        mp.put(xorr, mp.getOrDefault(xorr, 0) + 1);
        int ans = 0;
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            int tmp = it.getKey() ^ x;
            if (mp.containsKey(tmp)) {
                ans += (mp.get(tmp) * it.getValue());
            }
        }
        System.out.println(ans);
    }
}