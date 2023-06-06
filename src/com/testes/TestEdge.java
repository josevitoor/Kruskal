package com.testes;

public class TestEdge {
  //Caso de teste para verificar se a comparação retorna -1 quando
    //o weight do Edge atual é menor do que o weight do Edge passado como parâmetro:
    @Test
    public void testCompareTo_RetornaUmNegativo() {
        Vertex vertex1 = new Vertex(1, 1);
        Vertex vertex2 = new Vertex(2, 2);
        Edge edge1 = new Edge(vertex1, vertex2, 5);
        Edge edge2 = new Edge(vertex1, vertex2, 10);

        int result = edge1.compareTo(edge2);

        assertEquals(-1, result);
    }

    //Caso de teste para verificar se a comparação retorna 1 quando
    //o weight do Edge atual é maior que o weight do Edge passado como parâmetro:
    @Test
    public void testCompareTo_RetornaUmPositivo() {
        Vertex vertex1 = new Vertex(1, 1);
        Vertex vertex2 = new Vertex(2, 2);
        Edge edge1 = new Edge(vertex1, vertex2, 10);
        Edge edge2 = new Edge(vertex1, vertex2, 5);

        int result = edge1.compareTo(edge2);

        assertEquals(1, result);
    }

    //Caso de teste para verificar se a comparação retorna 0
    //quando o weight do Edge atual é igual ao weight do Edge passado como parâmetro:
    @Test
    public void testCompareTo_RetornaZero() {
        Vertex vertex1 = new Vertex(1, 1);
        Vertex vertex2 = new Vertex(2, 2);
        Edge edge1 = new Edge(vertex1, vertex2, 10);
        Edge edge2 = new Edge(vertex1, vertex2, 10);

        int result = edge1.compareTo(edge2);

        assertEquals(0, result);
    }
}
