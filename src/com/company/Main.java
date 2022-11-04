package com.company;

import com.company.Graphs.LinkedGraph;
import com.company.Graphs.Vertex;

public class Main {

    public static void main(String[] args) {

        LinkedGraph lG = new LinkedGraph();
        for (int i = 0; i < 5; ++i) {
            lG.addVertex();
        }
        for (Vertex x: lG.getVertexList()) {
            System.out.println(x.getNumber());
        }
        lG.deletVertex(3);
        for (Vertex x: lG.getVertexList()) {
            System.out.println(x.getNumber());
        }
        lG.addEdge(lG.getVertexList().get(1), lG.getVertexList().get(2));
        System.out.println(lG.buildGrid().toString());

    }
}

