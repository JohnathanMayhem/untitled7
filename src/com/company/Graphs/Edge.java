package com.company.Graphs;

import java.util.List;

public class Edge {
    List<Vertex> vList;

    public Edge(List<Vertex> vList) {
        this.vList = vList;
    }

    public Vertex getNeighbourOf(Vertex v){
        return (vList.get(0) != v ? vList.get(0) : vList.get(1));
    }

}
