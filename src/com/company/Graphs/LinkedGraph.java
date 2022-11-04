package com.company.Graphs;

import java.util.ArrayList;
import java.util.Comparator;


public class LinkedGraph implements Graph {

    ArrayList<Vertex> vertexList;
    ArrayList<Edge> edgeList;

    public LinkedGraph(ArrayList<Vertex> vertexList, ArrayList<Edge> edgeList) {
        this.vertexList = vertexList;
        this.edgeList = edgeList;
    }

    public LinkedGraph(LinkedGraph g) {
        this.vertexList = g.vertexList;
        this.edgeList = g.edgeList;
    }

    public LinkedGraph(){
        this.vertexList = new ArrayList<Vertex>();
        this.edgeList = new ArrayList<Edge>();
    }


    @Override
    public void addVertex() {
        Comparator<Vertex> comparator = Comparator.naturalOrder();
        this.vertexList.sort(comparator);
        Vertex v = new Vertex(this.vertexList.size());
        this.vertexList.add(v);
    }

    @Override
    public void addEdge() {

    }

    @Override
    public void deletVertex() {

    }

    @Override
    public void deletEdge() {

    }

    @Override
    public void buildGrid() {

    }
}
