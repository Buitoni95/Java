import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BSTTest {

	@Test
	void test1() {

		BST tree1 = new BST(); // Cria uma árvore vazia
		TNode root = new TNode(5); // Cria a raiz da arvore
		assertEquals(1, tree1.count(root), "A quantidade de nodos deve ser 1");
		// adiciona demais nodos
		tree1.insert(root, 7);
		tree1.insert(root, 4);
		tree1.insert(root, 1);
		tree1.insert(root, 9);
		tree1.insert(root, 6);
		tree1.insert(root, 3);
		assertEquals(7, tree1.count(root), "A quantidade de nodos deve ser 7");

		BST tree2 = new BST(); // Cria uma árvore vazia
		TNode root2 = new TNode(7); // Cria a raiz da arvore
		assertEquals(1, tree2.count(root2), "A quantidade de nodos deve ser 1");
		// adiciona demais nodos
		tree2.insert(root2, 4);
		tree2.insert(root2, 15);
		tree2.insert(root2, 12);
		tree2.insert(root2, 9);
		tree2.insert(root2, 18);
		tree2.insert(root2, 10);
		tree2.insert(root2, 11);
		tree2.insert(root2, 20);
		tree2.insert(root2, 0);
		tree2.insert(root2, 2);
		assertEquals(11, tree2.count(root2), "A quantidade de nodos deve ser 11");
	}

	@Test
	void test2() {

		BST tree1 = new BST(); // Cria uma árvore vazia
		TNode root = new TNode(5); // Cria a raiz da arvore
		assertEquals(5, tree1.sum(root), "O somatório deve ser 5");
		// adiciona demais nodos
		tree1.insert(root, 7);
		tree1.insert(root, 4);
		tree1.insert(root, 1);
		tree1.insert(root, 9);
		tree1.insert(root, 6);
		tree1.insert(root, 3);
		assertEquals(35, tree1.sum(root), "O somatório deve ser 35");

		BST tree2 = new BST(); // Cria uma árvore vazia
		TNode root2 = new TNode(7); // Cria a raiz da arvore
		assertEquals(7, tree2.sum(root2), "O somatório deve ser 7");
		// adiciona demais nodos
		tree2.insert(root2, 4);
		tree2.insert(root2, 15);
		tree2.insert(root2, 12);
		tree2.insert(root2, 9);
		tree2.insert(root2, 18);
		tree2.insert(root2, 10);
		tree2.insert(root2, 11);
		tree2.insert(root2, 20);
		tree2.insert(root2, 0);
		tree2.insert(root2, 2);
		assertEquals(108, tree2.sum(root2), "O somatório deve ser 108");
	}

	@Test
	void test3() {

		BST tree1 = new BST(); // Cria uma árvore vazia
		TNode root = new TNode(5); // Cria a raiz da arvore
		assertEquals(1, tree1.height(root), "A altura deve ser 1");
		// adiciona demais nodos
		tree1.insert(root, 7);
		tree1.insert(root, 4);
		tree1.insert(root, 1);
		tree1.insert(root, 9);
		tree1.insert(root, 6);
		tree1.insert(root, 3);
		assertEquals(4, tree1.height(root), "A altura deve ser 4");

		BST tree2 = new BST(); // Cria uma árvore vazia
		TNode root2 = new TNode(7); // Cria a raiz da arvore
		assertEquals(1, tree2.height(root2), "A altura deve ser 1");
		// adiciona demais nodos
		tree2.insert(root2, 4);
		tree2.insert(root2, 15);
		tree2.insert(root2, 12);
		tree2.insert(root2, 9);
		tree2.insert(root2, 18);
		tree2.insert(root2, 10);
		tree2.insert(root2, 11);
		tree2.insert(root2, 20);
		tree2.insert(root2, 0);
		tree2.insert(root2, 2);
		assertEquals(6, tree2.height(root2), "A altura deve ser 6");
	}

	@Test
	void test4() {

		BST tree1 = new BST(); // Cria uma árvore vazia
		TNode root = new TNode(5); // Cria a raiz da arvore
		assertEquals(5, tree1.max(root), "O maior valor deve ser 5");
		// adiciona demais nodos
		tree1.insert(root, 7);
		tree1.insert(root, 4);
		tree1.insert(root, 1);
		tree1.insert(root, 9);
		tree1.insert(root, 6);
		tree1.insert(root, 3);
		assertEquals(9, tree1.max(root), "O maior valor deve ser 9");

		BST tree2 = new BST(); // Cria uma árvore vazia
		TNode root2 = new TNode(7); // Cria a raiz da arvore
		assertEquals(7, tree2.max(root2), "O maior valor deve ser 7");
		// adiciona demais nodos
		tree2.insert(root2, 4);
		tree2.insert(root2, 15);
		tree2.insert(root2, 12);
		tree2.insert(root2, 9);
		tree2.insert(root2, 18);
		tree2.insert(root2, 10);
		tree2.insert(root2, 11);
		tree2.insert(root2, 20);
		tree2.insert(root2, 0);
		tree2.insert(root2, 2);
		assertEquals(20, tree2.max(root2), "O maior valor deve ser 20");
	}

	@Test
	void test5() {

		BST tree1 = new BST(); // Cria uma árvore vazia
		TNode root = new TNode(5); // Cria a raiz da arvore
		assertEquals(5, tree1.min(root), "O menor valor deve ser 5");
		// adiciona demais nodos
		tree1.insert(root, 7);
		tree1.insert(root, 4);
		tree1.insert(root, 1);
		tree1.insert(root, 9);
		tree1.insert(root, 6);
		tree1.insert(root, 3);
		assertEquals(1, tree1.min(root), "O menor valor deve ser 1");

		BST tree2 = new BST(); // Cria uma árvore vazia
		TNode root2 = new TNode(7); // Cria a raiz da arvore
		assertEquals(7, tree2.min(root2), "O menor valor deve ser 7");
		// adiciona demais nodos
		tree2.insert(root2, 4);
		tree2.insert(root2, 15);
		tree2.insert(root2, 12);
		tree2.insert(root2, 9);
		tree2.insert(root2, 18);
		tree2.insert(root2, 10);
		tree2.insert(root2, 11);
		tree2.insert(root2, 20);
		tree2.insert(root2, 0);
		tree2.insert(root2, 2);
		assertEquals(0, tree2.min(root2), "O menor valor deve ser 0");
	}

	@Test
	void test6() {

		BST tree1 = new BST(); // Cria uma árvore vazia
		TNode root = new TNode(5); // Cria a raiz da arvore
		// adiciona demais nodos
		tree1.insert(root, 7);
		tree1.insert(root, 4);
		tree1.insert(root, 1);
		tree1.insert(root, 9);
		tree1.insert(root, 6);
		tree1.insert(root, 3);

		assertEquals(true, tree1.find(root, 5), "O resultado deve ser true");
		assertEquals(true, tree1.find(root, 7), "O resultado deve ser true");
		assertEquals(true, tree1.find(root, 4), "O resultado deve ser true");
		assertEquals(true, tree1.find(root, 1), "O resultado deve ser true");
		assertEquals(true, tree1.find(root, 9), "O resultado deve ser true");
		assertEquals(true, tree1.find(root, 6), "O resultado deve ser true");
		assertEquals(true, tree1.find(root, 3), "O resultado deve ser true");

		assertEquals(false, tree1.find(root, 0), "O resultado deve ser false");
		assertEquals(false, tree1.find(root, 2), "O resultado deve ser false");
		assertEquals(false, tree1.find(root, 8), "O resultado deve ser false");
		assertEquals(false, tree1.find(root, 10), "O resultado deve ser false");
		assertEquals(false, tree1.find(root, 20), "O resultado deve ser false");

		BST tree2 = new BST(); // Cria uma árvore vazia
		TNode root2 = new TNode(7); // Cria a raiz da arvore
		// adiciona demais nodos
		tree2.insert(root2, 4);
		tree2.insert(root2, 15);
		tree2.insert(root2, 12);
		tree2.insert(root2, 9);
		tree2.insert(root2, 18);
		tree2.insert(root2, 10);
		tree2.insert(root2, 11);
		tree2.insert(root2, 20);
		tree2.insert(root2, 0);
		tree2.insert(root2, 2);

		assertEquals(true, tree2.find(root2, 7), "O resultado deve ser true");
		assertEquals(true, tree2.find(root2, 4), "O resultado deve ser true");
		assertEquals(true, tree2.find(root2, 15), "O resultado deve ser true");
		assertEquals(true, tree2.find(root2, 12), "O resultado deve ser true");
		assertEquals(true, tree2.find(root2, 9), "O resultado deve ser true");
		assertEquals(true, tree2.find(root2, 18), "O resultado deve ser true");
		assertEquals(true, tree2.find(root2, 10), "O resultado deve ser true");
		assertEquals(true, tree2.find(root2, 11), "O resultado deve ser true");
		assertEquals(true, tree2.find(root2, 20), "O resultado deve ser true");
		assertEquals(true, tree2.find(root2, 0), "O resultado deve ser true");
		assertEquals(true, tree2.find(root2, 2), "O resultado deve ser true");

		assertEquals(false, tree2.find(root2, 1), "O resultado deve ser false");
		assertEquals(false, tree2.find(root2, 3), "O resultado deve ser false");
		assertEquals(false, tree2.find(root2, 5), "O resultado deve ser false");
		assertEquals(false, tree2.find(root2, 6), "O resultado deve ser false");
		assertEquals(false, tree2.find(root2, 8), "O resultado deve ser false");
		assertEquals(false, tree2.find(root2, 13), "O resultado deve ser false");
		assertEquals(false, tree2.find(root2, 14), "O resultado deve ser false");
		assertEquals(false, tree2.find(root2, 16), "O resultado deve ser false");
		assertEquals(false, tree2.find(root2, 17), "O resultado deve ser false");
		assertEquals(false, tree2.find(root2, 19), "O resultado deve ser false");
		assertEquals(false, tree2.find(root2, 25), "O resultado deve ser false");
	}
}