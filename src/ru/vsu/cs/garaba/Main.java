package ru.vsu.cs.garaba;

import ru.vsu.cs.garaba.graph.AdjMatrixGraph;
import ru.vsu.cs.garaba.graph.MyGraphUtils;

public class Main {
    public static void main(String[] args) {
        AdjMatrixGraph graph = new AdjMatrixGraph();

        graph.addAdge(0, 1);
        graph.addAdge(0, 2);
        graph.addAdge(0, 3);
        graph.addAdge(0, 4);
        graph.addAdge(0, 5);
        graph.addAdge(0, 6);
        graph.addAdge(0, 7);


        System.out.println(MyGraphUtils.isGraphConnected(graph));
    }
}
