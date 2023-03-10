package Algorithms45.Ch_4_1;

import Algorithms45.edu.princeton.cs.algs4.Bag;
import Algorithms45.edu.princeton.cs.algs4.In;

/**
 * Created by HuGuodong on 1/28/20.
 */
public class _AdjListGraph {

  private final int V;
  private int E;
  // insert before head
  private Bag<Integer>[] adj;

  public _AdjListGraph(int V) {
    this.V = V;
    this.E = 0;
    this.adj = (Bag<Integer>[]) new Bag[V];
    for (int i = 0; i < V; i++) {
      adj[i] = new Bag<>();// initialize all lists
    }
  }

  public _AdjListGraph(In in) {
    this(in.readInt());
    int E = in.readInt();
    for (int i = 0; i < E; i++) {
      int v = in.readInt();
      int w = in.readInt();
      addEdge(v, w);
    }
  }

  public int V() {
    return V;
  }

  public int E() {
    return E;
  }

  public void addEdge(int v, int w) {
    adj[v].add(w);
    adj[w].add(v);
    E++;
  }

  public Iterable<Integer> adj(int v) {
    return adj[v];
  }

  @Override
  public String toString() {
    String s = V + " vertices, " + E + " edges\n";
    for (int v = 0; v < V; v++) {
      s += v + ":";
      for (Integer w : adj[v])
        s += w + " ";
      s += "\n";
    }
    return s;
  }
}
