package com.kruskal;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Algorithm {
    private ArrayList<Vertex> vertexList;
    private ArrayList<Edge> edgeList;
    private ArrayList<Node> nodesList;

    public Algorithm(ArrayList<Vertex> v, ArrayList<Edge> e) throws IOException {
        if(v.isEmpty() || e.isEmpty()){
            throw new IOException();
        }else{
            //Setando a lista de vértices, arestas e nós
            vertexList = v;
            edgeList = e;
            nodesList = new ArrayList<Node>(vertexList.size());
            setNodes(vertexList);
        }
    }

    public String calculateKruskal(String fileName) throws IOException {
        //Define uma lista das arestas ordenadas em ordem crescente de custo
        ArrayList<Edge> edgeSortList = edgeList;
        Collections.sort(edgeSortList);
        //Define uma árvore vazia
        ArrayList<Edge> outputGraph = new ArrayList<Edge>();
        for (Edge e: edgeSortList) {
            Vertex a = e.getA();
            Vertex b = e.getB();
            //Verifica se e acrescentado a outputGraph forma círculo
            if (find(a.getNo()) != find(b.getNo())) {
                //Acrescenta e a outputGraph
                outputGraph.add(e);
                union(a.getNo(), b.getNo());
            }
        }
        //Imprime o resultado
        return printGraph(outputGraph, fileName);
    }

    private int find(Node node) {
        //Encontrar o conjunto a qual o nó pertence
        while (node.getParent() != null)
            node = node.getParent();
        return node.getIndex();
    }

    private void union(Node a, Node b) {
        //União de dois nós que estão em conjuntos diferentes
        int indexA = find(a);
        int indexB = find(b);
        if (indexA == indexB) return;
        Node nodeA = nodesList.get(indexA);
        Node nodeB = nodesList.get(indexB);
        if (nodeA.getDegree() < nodeB.getDegree()) {
            nodeA.setParent(nodeB);
        } else if (nodeA.getDegree() > nodeB.getDegree()) {
            nodeB.setParent(nodeA);
        } else {
            nodeB.setParent(nodeA);
            nodeA.setDegree();
        }
    }

    private void setNodes(ArrayList<Vertex> vertices){
        //Inserindo os nós para cada vértice
        for (Vertex vertice : vertices){
            Node node = new Node(0, nodesList.size(), null);
            vertice.setNo(node);
            nodesList.add(node);
        }
    }

    private String printGraph(ArrayList<Edge> graph, String fileName) throws IOException {
        String print = "";
        for (Edge e: graph) {
            print = print.concat("(" + e.getA().getX() + "," +e.getA().getY() + ") ---" + e.getWeight() + "--- " +
                    "(" + e.getB().getX() + "," +e.getB().getY() +")\n");
        }
        generateFile(print, fileName);
        return print;
    }

    public void generateFile(String print, String fileName) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter(fileName));
        br.write(print);
        br.close();
    }
}
