package com.company.Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Edge {
    List<Vertex> vList;

    public Edge(List<Vertex> vList) {
        this.vList = vList;
    }

    public Edge(Vertex v1, Vertex v2){
        this.vList = new ArrayList<Vertex>();
        this.vList.add(v1);
        this.vList.add(v2);
    }

    public List<Vertex> getVetertexes(){
        return (this.vList);
    }


    public Vertex getNeighbourOf(Vertex v){
        return (vList.get(0) != v ? vList.get(0) : vList.get(1));
    }

}
