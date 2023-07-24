class dfsByStack {
    boolean sizeSetting; // 초기 세팅
    Stack<Integer> stack; // 재귀적 방법을 위한 스택
    HashSet<Integer> visited; // 방문 기록
    ArrayList<Integer> result; // 결과 리스트

    dfsByStack() {
        sizeSetting = false;
    }

    public List<Integer> dfs(int[][] graph, int startNode) {

        if (!sizeSetting) { // 초기 세팅
            visited = new HashSet();
            stack = new Stack<>();
            result = new ArrayList<>(graph.length - 1);
            sizeSetting = true;
        }

        visited.add(startNode); 
        stack.push(startNode);

        while (!stack.isEmpty()) {
            Integer node = stack.pop();
            result.add(node);

            for (int vertex : graph[node]) {
                if (!visited.contains(vertex)) {
                    stack.push(vertex);
                    visited.add(vertex);
                }
            }
        }
        sizeSetting = false; // 초기 설정값 false
        return result;
    }
}
