void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {

    visited[node] = true;

    System.out.print(node + " ");

    for (int neighbour : adj.get(node)) {

        if (!visited[neighbour]) {
            dfs(neighbour, visited, adj);
        }
    }
}