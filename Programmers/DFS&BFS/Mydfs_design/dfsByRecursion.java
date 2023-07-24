class dfsByRecursion {
    int depth = 0; //재귀의 깊이
    boolean sizeSetting; // 초기 세팅
    HashSet<Integer> visited; // 방문 기록
    ArrayList<Integer> result; // 결과 리스트

    dfsByRecursion() {
        sizeSetting = false;
    }

    public List<Integer> dfs(int[][] graph, int startNode) {

        depth++; //재귀 깊이 증가

        if (!sizeSetting) { // 초기 세팅
            visited = new HashSet();
            result = new ArrayList<>(graph.length - 1);
            sizeSetting = true;
        }

        visited.add(startNode);
        result.add(startNode);

        for (int vertex : graph[startNode]) {
            if (!visited.contains(vertex)) {
                dfs(graph, vertex);
            }
        }

        depth--; // 재귀 깊이 감소

        if (depth == 0) { // 재귀가 끝나는 시점에 초기 설정값 false
            sizeSetting = false;
        }

        return result;
    }
}