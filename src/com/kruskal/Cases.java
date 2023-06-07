package com.kruskal;

import java.io.IOException;
import java.util.ArrayList;

public class Cases {

    public String createGraphCase1() throws IOException {
        ArrayList<Vertex> vertexList = new ArrayList<Vertex>();
        ArrayList<Edge> edgeList = new ArrayList<Edge>();
        //Criando os vértices
        Vertex vertex1 = new Vertex(5,5);
        Vertex vertex2 = new Vertex(10,15);
        Vertex vertex3 = new Vertex(15,5);
        Vertex vertex4 = new Vertex(25,15);
        Vertex vertex5 = new Vertex(25,5);
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);
        vertexList.add(vertex4);
        vertexList.add(vertex5);
        //Criando as arestas
        Edge edge1 = new Edge(vertex1, vertex2, 2);
        Edge edge2 = new Edge(vertex2, vertex3, 3);
        Edge edge3 = new Edge(vertex1, vertex3, 1);
        Edge edge4 = new Edge(vertex2, vertex4, 2);
        Edge edge5 = new Edge(vertex4, vertex5, 3);
        Edge edge6 = new Edge(vertex3, vertex5, 3);
        edgeList.add(edge1);
        edgeList.add(edge2);
        edgeList.add(edge3);
        edgeList.add(edge4);
        edgeList.add(edge5);
        edgeList.add(edge6);
        //Passando o grafo pro calculo do algoritmo
        Algorithm kruskal = new Algorithm(vertexList, edgeList);
        return kruskal.calculateKruskal("test.txt");
    }

    public String createGraphCase2() throws IOException {
        ArrayList<Vertex> vertexList = new ArrayList<Vertex>();
        ArrayList<Edge> edgeList = new ArrayList<Edge>();
        //Criando os vértices
        Vertex vertex1 = new Vertex(5,10);
        Vertex vertex2 = new Vertex(5,15);
        Vertex vertex3 = new Vertex(10,0);
        Vertex vertex4 = new Vertex(15,5);
        Vertex vertex5 = new Vertex(15,15);
        Vertex vertex6 = new Vertex(25,0);
        Vertex vertex7 = new Vertex(25,10);
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);
        vertexList.add(vertex4);
        vertexList.add(vertex5);
        vertexList.add(vertex6);
        vertexList.add(vertex7);
        //Criando as arestas
        Edge edge1 = new Edge(vertex1, vertex2, 3);
        Edge edge2 = new Edge(vertex1, vertex3, 2);
        Edge edge3 = new Edge(vertex1, vertex4, 2);
        Edge edge4 = new Edge(vertex2, vertex4, 2);
        Edge edge5 = new Edge(vertex2, vertex5, 3);
        Edge edge6 = new Edge(vertex3, vertex6, 1);
        Edge edge7 = new Edge(vertex4, vertex6, 1);
        Edge edge8 = new Edge(vertex4, vertex7, 4);
        Edge edge9 = new Edge(vertex5, vertex7, 2);
        Edge edge10 = new Edge(vertex7, vertex6, 4);
        edgeList.add(edge1);
        edgeList.add(edge2);
        edgeList.add(edge3);
        edgeList.add(edge4);
        edgeList.add(edge5);
        edgeList.add(edge6);
        edgeList.add(edge7);
        edgeList.add(edge8);
        edgeList.add(edge9);
        edgeList.add(edge10);
        //Passando o grafo pro calculo do algoritmo
        Algorithm kruskal = new Algorithm(vertexList, edgeList);
        return kruskal.calculateKruskal("test.txt");
    }
    public String createGraphCase3() throws IOException {
        ArrayList<Vertex> vertexList = new ArrayList<Vertex>();
        ArrayList<Edge> edgeList = new ArrayList<Edge>();
        //Criando os vértices
        Vertex vertex1 = new Vertex(5,10);
        Vertex vertex2 = new Vertex(10,5);
        Vertex vertex3 = new Vertex(15,5);
        Vertex vertex4 = new Vertex(15,10);
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);
        vertexList.add(vertex4);
        //Criando as arestas
        Edge edge1 = new Edge(vertex1, vertex2, 1);
        Edge edge2 = new Edge(vertex1, vertex4, 1);
        Edge edge3 = new Edge(vertex1, vertex3, 2);
        Edge edge4 = new Edge(vertex2, vertex3, 3);
        Edge edge5 = new Edge(vertex2, vertex4, 4);
        Edge edge6 = new Edge(vertex3, vertex4, 3);
        edgeList.add(edge1);
        edgeList.add(edge2);
        edgeList.add(edge3);
        edgeList.add(edge4);
        edgeList.add(edge5);
        edgeList.add(edge6);
        //Passando o grafo pro calculo do algoritmo
        Algorithm kruskal = new Algorithm(vertexList, edgeList);
        return kruskal.calculateKruskal("test.txt");
    }

    public String createGraphCase4() throws IOException {
        ArrayList<Vertex> vertexList = new ArrayList<Vertex>();
        ArrayList<Edge> edgeList = new ArrayList<Edge>();
        //Criando os vértices
        Vertex vertex1 = new Vertex(0,5);
        Vertex vertex2 = new Vertex(5,10);
        Vertex vertex3 = new Vertex(10,5);
        Vertex vertex4 = new Vertex(15,10);
        Vertex vertex5 = new Vertex(20,5);
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);
        vertexList.add(vertex4);
        vertexList.add(vertex5);
        //Criando as arestas
        Edge edge1 = new Edge(vertex1, vertex2, 4);
        Edge edge2 = new Edge(vertex1, vertex3, 1);
        Edge edge3 = new Edge(vertex2, vertex3, 2);
        Edge edge4 = new Edge(vertex2, vertex4, 3);
        Edge edge5 = new Edge(vertex3, vertex4, 2);
        Edge edge6 = new Edge(vertex3, vertex5, 1);
        Edge edge7 = new Edge(vertex4, vertex5, 3);
        edgeList.add(edge1);
        edgeList.add(edge2);
        edgeList.add(edge3);
        edgeList.add(edge4);
        edgeList.add(edge5);
        edgeList.add(edge6);
        edgeList.add(edge7);
        //Passando o grafo pro calculo do algoritmo
        Algorithm kruskal = new Algorithm(vertexList, edgeList);
        return kruskal.calculateKruskal("test.txt");
    }
}
