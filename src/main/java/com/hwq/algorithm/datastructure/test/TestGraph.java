package com.hwq.algorithm.datastructure.test;

import com.hwq.algorithm.datastructure.Graph;

/**
 * Created by hwq on 2019/10/23.
 */
public class TestGraph {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,3);
        graph.addEdge(3,4);

//        graph.dfs();
        graph.mst();
    }
}
