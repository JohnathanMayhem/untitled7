package com.company.Graphs;

import java.util.*;

public class Vertex implements Comparable <Vertex> {
    Integer number;

    ArrayList<Edge> edges;

    public Vertex(int number, ArrayList<Edge> edges) {
        this.number = number;
        this.edges = edges;
    }

    public Vertex(int number){
        this.number = number;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Vertex v){
        Vertex [] temp = {this, v};
        Edge e = new Edge(Arrays.asList(temp));
        this.edges.add(e);
        v.edges.add(e);
    }

    public void addEdge(Edge e){
        this.edges.add(e);
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    public int compareTo(Vertex o) {
        return this.number.compareTo(o.number);
    }
}
