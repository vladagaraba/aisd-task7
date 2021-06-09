package ru.vsu.cs.garaba.graph;

import java.util.function.Consumer;

public class MyGraphUtils {

    public static void dfsRecursion(Graph graph, int from, Consumer<Integer> visitor) {
        boolean[] visited = new boolean[graph.vertexCount()];

        class Inner {
            void visit(Integer current) {
                visitor.accept(current);
                visited[current] = true;

                for (Integer v : graph.adjacencies(current)) {
                    if (!visited[v]) {
                        visit(v);
                    }
                }

            }
        }
        new Inner().visit(from);
    }

    public static boolean[] findNotVisitedVertex(Graph graph) {
        boolean[] isVisited;
        if (graph == null) {
            return null;
        } else {
            isVisited = new boolean[graph.vertexCount()];
            dfsRecursion(graph, 0, v ->
                    isVisited[v] = true);
        }
        return isVisited;
    }

    public static boolean isGraphConnected(Graph graph) {
        boolean[] vertexIsNotVisited = findNotVisitedVertex(graph);

        for (int i = 0; i < vertexIsNotVisited.length; i++) {
            if (!vertexIsNotVisited[i] == true)
                return false;
        }
        return true;
    }
}
