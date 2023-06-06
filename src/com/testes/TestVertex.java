package com.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.kruskal.*;



class TestVertex {
	 /*
     * Classes de equivalencia x e y: negativo, zero, positivo
     * classes de equivalencia para node: null e não nulo
     * */

	@Test
    void testGetXPositivo() {
        // Cenário 1: Valor positivo
        Vertex vertex1 = new Vertex(1, 0);
        Assertions.assertEquals(1, vertex1.getX());
	}
	@Test
	void testGetXZero() {
        // Cenário 2: Valor zero
        Vertex vertex2 = new Vertex(0, 0);
        Assertions.assertEquals(0, vertex2.getX());
	}
	@Test
	void testGetXNegativo() {
        // Cenário 3: Valor negativo
        Vertex vertex3 = new Vertex(-1, 0);
        Assertions.assertEquals(-1, vertex3.getX());
    }

	@Test
    void testGetYPositivo() {
        // Cenário 1: Valor positivo
        Vertex vertex1 = new Vertex(0, 1);
        Assertions.assertEquals(1, vertex1.getY());
	}
	@Test
	void testGetYZero() {
        // Cenário 2: Valor zero
        Vertex vertex2 = new Vertex(0, 0);
        Assertions.assertEquals(0, vertex2.getY());
	}
	@Test
	void testGetYNegativo() {
        // Cenário 3: Valor negativo
        Vertex vertex3 = new Vertex(0, -1);
        Assertions.assertEquals(-1, vertex3.getY());
    }

    @Test
    void testGetNode() {
        // Cenário 1: Nó não nulo
        Node node = new Node(0, 0, null);
        Vertex vertex = new Vertex(0, 0);
        vertex.setNo(node);
        Assertions.assertEquals(node, vertex.getNo());
    }
    @Test
    void testGetNodeNull() {
        // Cenário 2: Nó nulo
        Vertex vertex2 = new Vertex(0, 0);
        Assertions.assertNull(vertex2.getNo());
    }

    @Test
    void testSetNode() {
        // Cenário 1: Atualização do nó
        Node node = new Node(0, 0, null);
        Vertex vertex = new Vertex(0, 0);
        vertex.setNo(node);
        Assertions.assertEquals(node, vertex.getNo());
    }

}
