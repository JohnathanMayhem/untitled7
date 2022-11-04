package com.company.Graphs;

import java.util.ArrayList;

public interface Graph {

    void addVertex();

    void addEdge(Vertex v1, Vertex v2);

    void deletVertex(int number);

    void deletEdge(Edge e);

    void deletEdgeOfVertex(Vertex v);

    ArrayList<ArrayList<Integer>> buildGrid();
}
