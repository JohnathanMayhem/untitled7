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

    public ArrayList<Vertex> getVertexList(){
        return this.vertexList;
    }


    @Override
    public void addVertex() {
        Vertex v = new Vertex(this.vertexList.size()+1);
        this.vertexList.add(v);
    }

    @Override
    public void addEdge(Vertex v1, Vertex v2) {
        Edge e = new Edge(v1, v2);
        this.edgeList.add(e);
    }

    @Override
    public void deletVertex(int number) {
        Comparator<Vertex> comparator = Comparator.naturalOrder();
        this.vertexList.sort(comparator);
        Vertex v = this.vertexList.remove(number-1);
        deletEdgeOfVertex(v);
    }

    @Override
    public void deletEdge(Edge e) {
        this.edgeList.remove(e);
    }

    @Override
    public void deletEdgeOfVertex(Vertex v) {
        this.edgeList.removeIf(e -> e.getVetertexes().contains(v));
    }


    @Override
    public ArrayList<ArrayList<Integer>> buildGrid() {
        ArrayList<ArrayList<Integer>> grid = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < this.vertexList.size(); ++i) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < this.vertexList.size(); ++j) {
                row.add(0);
            }
            grid.add(row);
        }
        for (Edge e: this.edgeList) {
            ArrayList<Integer> ver = grid.get(e.vList.get(0).getNumber()-1);
            ver.set(e.vList.get(1).getNumber()-1, 1);
            ver= grid.get(e.vList.get(1).getNumber()-1);
            ver.set(e.vList.get(0).getNumber()-1, 1);
        }
        return grid;
    }

}
