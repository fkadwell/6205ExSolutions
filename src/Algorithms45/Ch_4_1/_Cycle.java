package Algorithms45.Ch_4_1;

/**
 * Created by HuGuodong on 2/1/20.
 */
public class _Cycle {

  private boolean[] marked;
  private boolean hasCycle;

  public _Cycle(_AdjListGraph G) {
    marked = new boolean[G.V()];
    for (int s = 0; s < G.V(); s++) {
      dfs(G, s, s);
    }
  }

  private void dfs(_AdjListGraph G, int v, int u) {
    marked[u] = true;
    for (int w : G.adj(v)) {
      if (!marked[w]) {
        dfs(G, w, v);
      }
      else if (w != u) {
        hasCycle = true;
      }
    }
  }

  public boolean hasCycle() {
    return hasCycle;
  }
}
