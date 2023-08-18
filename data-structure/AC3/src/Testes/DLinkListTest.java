package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import linked.DLinkedList;

class DLinkListTest {

	@Test
	void test1() {
		// Função addTail
		DLinkedList lista = new DLinkedList();

		assertEquals(lista.toString(), "", "Deve retornar uma lista vazia");
		assertEquals(lista.size, 0, "Tamanho da lista deve ser 0");

		lista.addTail(10);
		assertEquals(lista.toString(), "10", "Deve retornar: 10");
		assertEquals(lista.size, 1, "Tamanho da lista deve ser 1");

		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);
		assertEquals(lista.toString(), "10 20 30 40", "Deve retornar: 10 20 30 40");
		assertEquals(lista.size, 4, "Tamanho da lista deve ser 4");
	}

	@Test
	void test2() {
		// Função addHead
		DLinkedList lista = new DLinkedList();

		assertEquals(lista.toString(), "", "Deve retornar uma lista vazia");

		lista.addHead(10);
		assertEquals(lista.toString(), "10", "Deve retornar: 10");
		assertEquals(lista.size, 1, "Tamanho da lista deve ser 1");

		lista.addHead(20);
		lista.addHead(30);
		lista.addHead(40);
		assertEquals(lista.toString(), "40 30 20 10", "Deve retornar: 40 30 20 10");
		assertEquals(lista.size, 4, "Tamanho da lista deve ser 4");
	}

	@Test
	void test3() {
		// Função removeTail
		DLinkedList lista = new DLinkedList();

		lista.addTail(10);
		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);

		lista.removeTail();
		assertEquals(lista.toString(), "10 20 30", "Deve retornar: 10 20 30");
		assertEquals(lista.size, 3, "Tamanho da lista deve ser 3");
		lista.removeTail();
		assertEquals(lista.toString(), "10 20", "Deve retornar: 10 20");
		lista.removeTail();
		assertEquals(lista.toString(), "10", "Deve retornar uma lista vazia");
		assertEquals(lista.size, 1, "Tamanho da lista deve ser 1");
		lista.removeTail();
		assertEquals(lista.toString(), "", "Deve retornar uma lista vazia");
		lista.removeTail();
		assertEquals(lista.toString(), "", "Deve retornar uma lista vazia");
		assertEquals(lista.size, 0, "Tamanho da lista deve ser 0");
	}

	@Test
	void test4() {
		// Função removeHead
		DLinkedList lista = new DLinkedList();

		lista.addTail(10);
		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);

		lista.removeHead();
		assertEquals(lista.toString(), "20 30 40", "Deve retornar: 20 30 40");
		assertEquals(lista.size, 3, "Tamanho da lista deve ser 3");
		lista.removeHead();
		assertEquals(lista.toString(), "30 40", "Deve retornar: 30 40");
		lista.removeHead();
		assertEquals(lista.toString(), "40", "Deve retornar: 40");
		assertEquals(lista.size, 1, "Tamanho da lista deve ser 1");
		lista.removeHead();
		assertEquals(lista.toString(), "", "Deve retornar uma lista vazia");
		assertEquals(lista.size, 0, "Tamanho da lista deve ser 0");
		lista.removeHead();
		assertEquals(lista.toString(), "", "Deve retornar uma lista vazia");
	}

	@Test
	void test5() {
		// Função find
		DLinkedList lista = new DLinkedList();

		assertEquals(lista.find(10), false, "Deve retornar false");

		lista.addTail(10);
		assertEquals(lista.find(10), true, "Deve retornar true");
		assertEquals(lista.find(200), false, "Deve retornar false");

		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);

		assertEquals(lista.find(30), true, "Deve retornar true");
		assertEquals(lista.find(40), true, "Deve retornar true");
		assertEquals(lista.find(200), false, "Deve retornar false");
	}

	@Test
	void test6() {
		// Função removeItem
		DLinkedList lista = new DLinkedList();

		assertEquals(lista.removeItem(200), null, "Deve retornar null");

		lista.addTail(10);
		assertEquals(lista.removeItem(200), null, "Deve retornar null");
		assertEquals(lista.toString(), "10", "Deve retornar: 10");
		assertEquals(lista.size, 1, "Tamanho da lista deve ser 1");

		assertEquals(lista.removeItem(10).element, 10, "Deve retornar nodo com elemento 10");
		assertEquals(lista.toString(), "", "Deve retornar uma lista vazia");

		lista.addTail(10);
		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);
		assertEquals(lista.removeItem(10).element, 10, "Deve retornar nodo com elemento 10");
		assertEquals(lista.toString(), "20 30 40", "Deve retornar: 20 30 40");
		assertEquals(lista.size, 3, "Tamanho da lista deve ser 3");

		assertEquals(lista.removeItem(30).element, 30, "Deve retornar nodo com elemento 30");
		assertEquals(lista.toString(), "20 40", "Deve retornar: 20 40");
		assertEquals(lista.size, 2, "Tamanho da lista deve ser 2");

		assertEquals(lista.removeItem(200), null, "Deve retornar null");
		assertEquals(lista.toString(), "20 40", "Deve retornar: 20 40");
		assertEquals(lista.size, 2, "Tamanho da lista deve ser 2");

		assertEquals(lista.removeItem(40).element, 40, "Deve retornar nodo com elemento 40");
		assertEquals(lista.toString(), "20", "Deve retornar: 20");
		assertEquals(lista.size, 1, "Tamanho da lista deve ser 1");

		assertEquals(lista.removeItem(20).element, 20, "Deve retornar nodo com elemento 20");
		assertEquals(lista.toString(), "", "Deve retornar uma lista vazia");
		assertEquals(lista.size, 0, "Tamanho da lista deve ser 0");
	}

	@Test
	void test7() {
		// Função insert
		DLinkedList lista = new DLinkedList();

		lista.addTail(10);

		lista.insert(200, 0);
		assertEquals(lista.toString(), "200 10", "Deve retornar: 200 10");
		assertEquals(lista.size, 2, "Tamanho da lista deve ser 2");

		lista.insert(300, 0);
		assertEquals(lista.toString(), "300 200 10", "Deve retornar: 300 200 10");
		assertEquals(lista.size, 3, "Tamanho da lista deve ser 3");

		lista.insert(400, 1);
		assertEquals(lista.toString(), "300 400 200 10", "Deve retornar: 300 400 200 10");

		lista.insert(500, 2);
		assertEquals(lista.toString(), "300 400 500 200 10", "Deve retornar: 300 400 500 200 10");

		lista.insert(600, 4);
		assertEquals(lista.toString(), "300 400 500 200 600 10", "Deve retornar: 300 400 500 200 600 10");
		assertEquals(lista.size, 6, "Tamanho da lista deve ser 6");
		
		lista.insert(700, 6);
		assertEquals(lista.toString(), "300 400 500 200 600 10 700", "Deve retornar: 300 400 500 200 600 10 700");
		assertEquals(lista.size, 7, "Tamanho da lista deve ser 7");
	}
}
