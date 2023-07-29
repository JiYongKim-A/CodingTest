class bfsByQueue {
    boolean sizeSetting;
    HashSet<Integer> visited;
    Queue<Integer> queue;
    ArrayList<Integer> result;

    bfsByQueue() {
        sizeSetting = false;
    }

    public List<Integer> bfs(int[][] graph, int startNode) {
        if (!sizeSetting) {
            visited = new HashSet<>();
            result = new ArrayList<>(graph.length);
            queue = new LinkedList<>();
            sizeSetting = true;
        }
        result.add(startNode);
        visited.add(startNode);
        queue.add(startNode);

        while (!queue.isEmpty()) {
            Integer visitedNode = queue.poll();
            for (Integer vertex : graph[visitedNode]) {
                if (!visited.contains(vertex)) {
                    result.add(vertex);
                    visited.add(vertex);
                    queue.add(vertex);
                }
            }
        }
        sizeSetting = false;
        return result;
    }
}