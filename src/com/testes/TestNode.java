package com.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import com.kruskal.*;

import org.junit.jupiter.api.Test;

class TestNode {
       /*
        * Classes de equivalencia degree e index: negativo, zero, positivo
        * classes de equivalencia parent: null e não nulo
        * */
	   @Test 
	    void testGetDegreePositivo() {
	        // Cenário 1: Grau positivo
	        Node node1 = new Node(1, 0, null);
	        Assertions.assertEquals(1, node1.getDegree());
	   }
	   @Test 
	    void testGetDegreeZero() {
	        // Cenário 2: Grau zero
	        Node node2 = new Node(0, 0, null);
	        Assertions.assertEquals(0, node2.getDegree());
	   }
	   @Test 
	    void testGetDegreeNegativo() {
	        // Cenário 3: Grau negativo
	        Node node3 = new Node(-1, 0, null);
	        Assertions.assertEquals(-1, node3.getDegree());
	    }

	    @Test
	    void testGetIndexPositivo() {
	        // Cenário 1: Índice positivo
	        Node node1 = new Node(0, 1, null);
	        Assertions.assertEquals(1, node1.getIndex());
	    }
	    @Test
	    void testGetIndexZero() {
	        // Cenário 2: Índice zero
	        Node node2 = new Node(0, 0, null);
	        Assertions.assertEquals(0, node2.getIndex());
	    }
	    @Test
	    void testGetIndexNegativo() {
	        // Cenário 3: Índice negativo
	        Node node3 = new Node(0, -1, null);
	        Assertions.assertEquals(-1, node3.getIndex());
	    }

	    @Test
	    void testGetParent() {
	        // Cenário 1: Nó pai não nulo
	        Node parent = new Node(0, 0, null);
	        Node node = new Node(0, 0, parent);
	        Assertions.assertEquals(parent, node.getParent());
	    }
	    @Test
	    void testGetParentNulo() {
	        // Cenário 2: Nó pai nulo
	        Node node2 = new Node(0, 0, null);
	        Assertions.assertNull(node2.getParent());
	    }

	    @Test
	    void testSetDegree() {
	        // Cenário 1: Incremento de grau
	        Node node = new Node(2, 0, null);
	        node.setDegree();
	        Assertions.assertEquals(3, node.getDegree());
	    }

	    @Test
	    void testSetParent() {
	        // Cenário 1: Atualização do nó pai
	        Node parent1 = new Node(0, 0, null);
	        Node parent2 = new Node(0, 0, null);
	        Node node = new Node(0, 0, parent1);

	        node.setParent(parent2);
	        Assertions.assertEquals(parent2, node.getParent());
	    }
	

}

