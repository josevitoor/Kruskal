package com.testes;

import com.kruskal.Algorithm;
import com.kruskal.Edge;
import com.kruskal.Node;
import com.kruskal.Vertex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class TestAlgorithm {

    private ArrayList<Vertex> vertexList;
    private ArrayList<Edge> edgeList;

    @BeforeEach
    void setUp() {
        vertexList = new ArrayList<>();
        edgeList = new ArrayList<>();
    }

    @Test
    void testConstructorWithEmptyListsThrowsIOException() {
        // Verificação se uma IOException é lançada ao criar o algoritmo com listas vazias
        Assertions.assertThrows(IOException.class, () -> new Algorithm(vertexList, edgeList));
    }

    @Test
    void testConstructorWithEmptyEdgeThrowsIOException() {
        //Criando os vértices
        Vertex vertex1 = new Vertex(5, 5);
        Vertex vertex2 = new Vertex(10, 15);
        Vertex vertex3 = new Vertex(15, 5);
        Vertex vertex4 = new Vertex(25, 15);
        Vertex vertex5 = new Vertex(25, 5);
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);
        vertexList.add(vertex4);
        vertexList.add(vertex5);
        // Verificação se uma IOException é lançada ao criar o algoritmo com listas vazias
        Assertions.assertThrows(IOException.class, () -> new Algorithm(vertexList, edgeList));
    }

    @Test
    void testCalculateKruskal() throws IOException {
        //Caso de teste válido
        //Criando os vértices
        Vertex vertex1 = new Vertex(5, 5);
        Vertex vertex2 = new Vertex(10, 15);
        Vertex vertex3 = new Vertex(15, 5);
        Vertex vertex4 = new Vertex(25, 15);
        Vertex vertex5 = new Vertex(25, 5);
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

        Algorithm algorithm = new Algorithm(vertexList, edgeList);
        String result = algorithm.calculateKruskal("test.txt");

        //Resultado esperado
        String expected = "(5,5) ---1--- (15,5)\n" +
                "(5,5) ---2--- (10,15)\n" +
                "(10,15) ---2--- (25,15)\n" +
                "(25,15) ---3--- (25,5)\n";

        //Comparação com o resultado obtido removendo espaços em branco e quebra de linha
        assertEquals(expected.replaceAll("\\s", ""), result.replaceAll("\\s", ""));
    }

    @Test
    void testCalculateKruska2() throws IOException {
        //Caso de teste válido
        //Criando os vértices
        Vertex vertex1 = new Vertex(5, 5);
        Vertex vertex2 = new Vertex(10, 15);
        Vertex vertex3 = new Vertex(15, 5);
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);

        //Criando as arestas
        Edge edge1 = new Edge(vertex1, vertex2, 6);
        Edge edge2 = new Edge(vertex2, vertex3, 3);
        Edge edge3 = new Edge(vertex1, vertex3, 1);
        edgeList.add(edge1);
        edgeList.add(edge2);
        edgeList.add(edge3);

        Algorithm algorithm = new Algorithm(vertexList, edgeList);
        String result = algorithm.calculateKruskal("test.txt");

        //Resultado esperado
        String expected = "(5,5) ---1--- (15,5)\n" +
                "(10,15) ---3--- (15,5)\n";

        //Comparação com o resultado obtido removendo espaços em branco e quebra de linha
        assertEquals(expected.replaceAll("\\s", ""), result.replaceAll("\\s", ""));
    }

    @Test
    public void testCalculateKruskalValueZero() throws IOException {
        //Caso de teste inválido: Valores null
        //Criando os vértices
        Vertex vertex1 = new Vertex(0, 0);
        Vertex vertex2 = new Vertex(0, 0);
        Vertex vertex3 = new Vertex(0, 0);
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);

        //Criando as arestas
        Edge edge1 = new Edge(vertex1, vertex2, 0);
        Edge edge2 = new Edge(vertex2, vertex3, 0);
        Edge edge3 = new Edge(vertex1, vertex3, 0);
        edgeList.add(edge1);
        edgeList.add(edge2);
        edgeList.add(edge3);

        //Passando o grafo pro calculo do algoritmo
        Algorithm kruskal = new Algorithm(vertexList, edgeList);
        String result = kruskal.calculateKruskal("test.txt");

        //Resultado esperado
        String expected = "(0,0) ---0--- (0,0)\n" +
                "(0,0) ---0--- (0,0)\n";

        //Comparação com o resultado obtido removendo espaços em branco e quebra de linha
        assertEquals(expected.replaceAll("\\s", ""), result.replaceAll("\\s", ""));
    }

    @Test
    public void testGenerateFileIOException() throws IOException {
        //Caso de teste inválido: IOException ao gerar o arquivo
        //Criando os vértices
        Vertex vertex1 = new Vertex(5, 5);
        Vertex vertex2 = new Vertex(10, 15);
        Vertex vertex3 = new Vertex(15, 5);
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);

        //Criando as arestas
        Edge edge1 = new Edge(vertex1, vertex2, 2);
        Edge edge2 = new Edge(vertex2, vertex3, 3);
        Edge edge3 = new Edge(vertex1, vertex3, 1);
        edgeList.add(edge1);
        edgeList.add(edge2);
        edgeList.add(edge3);

        //Passando o grafo pro calculo do algoritmo
        Algorithm kruskal = new Algorithm(vertexList, edgeList);

        // Verifique se uma IOException é lançada ao criar o algoritmo
        assertThrows(IOException.class, () -> kruskal.calculateKruskal("////"));
    }

    @Test
    public void testGenerateFile() throws IOException {
        //Caso de teste válido: geração de arquivo
        //Criando os vértices
        Vertex vertex1 = new Vertex(5, 5);
        Vertex vertex2 = new Vertex(10, 15);
        vertexList.add(vertex1);
        vertexList.add(vertex2);

        //Criando as arestas
        Edge edge1 = new Edge(vertex1, vertex2, 2);
        edgeList.add(edge1);

        //Passando o grafo para o cálculo do algoritmo
        Algorithm kruskal = new Algorithm(vertexList, edgeList);
        String result = kruskal.calculateKruskal("test.txt");

        // Verificar se o arquivo foi gerado corretamente
        File file = new File("test.txt");
        assertTrue(file.exists());
    }

    @Test
    void testUnionSameIndex() throws IOException{
        //Criando os vértices
        Vertex vertex1 = new Vertex(5, 5);
        Vertex vertex2 = new Vertex(10, 15);
        Vertex vertex3 = new Vertex(15, 5);
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);

        //Criando as arestas
        Edge edge1 = new Edge(vertex1, vertex2, 6);
        Edge edge2 = new Edge(vertex2, vertex3, 3);
        Edge edge3 = new Edge(vertex1, vertex3, 1);
        edgeList.add(edge1);
        edgeList.add(edge2);
        edgeList.add(edge3);
        Algorithm algorithm = new Algorithm(vertexList, edgeList);

        // Obtendo os índices dos vértices
        Node nodeA = new Node(2, 1, null);
        Node nodeB = new Node(2, 1, null);

        // Realizando a união
        algorithm.union(nodeA, nodeB);

        assertEquals(nodeA.getIndex(), nodeB.getIndex());
    }

    @Test
    void testGenerateFileKillMutante() throws IOException {
        // Caso de teste válido: geração de arquivo
        // Criando os vértices
        Vertex vertex1 = new Vertex(5, 5);
        Vertex vertex2 = new Vertex(10, 15);
        vertexList.add(vertex1);
        vertexList.add(vertex2);

        // Criando as arestas
        Edge edge1 = new Edge(vertex1, vertex2, 2);
        edgeList.add(edge1);

        // Passando o grafo para o cálculo do algoritmo
        Algorithm kruskal = new Algorithm(vertexList, edgeList);
        String result = kruskal.calculateKruskal("test.txt");

        // Verificar se o arquivo foi gerado corretamente
        File file = new File("test.txt");
        assertTrue(file.exists());

        // Verificar se o conteúdo do arquivo está correto
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        assertEquals(result, content.toString());
    }
}
