package linked;
public class DLinkedList {

	public DNode header; // cabeçalho
	public DNode trailer; // final
	public int size; // tamanho da lista

	
	/*
	 * Cria uma nova lista vazia
	 */
	public DLinkedList() {
		header = null;
		trailer = null;
		size = 0;
	}

	
	/*
	 * Insere um nodo no final da lista.
	 */
	public void addTail(int element) {

		// cria um novo nodo
		DNode v = new DNode(element);

		// lista vazia
		if (size == 0) {
			header = new DNode(null); // cria o nodo header e trailer
			trailer = new DNode(null);
			
			header.next = v; // header.next aponta para novo nodo
			trailer.prev = v; // trailer.prev aponta para novo nodo

			v.next = trailer; // nodo.next aponta para o trailer
			v.prev = header; // nodo.prev aponta para o header
		} else {

			v.next = trailer;
			v.prev = trailer.prev;
			trailer.prev.next = v;
			trailer.prev = v;
		}
		size++;
	}

	
	/*
	 * Remove e retorna o nodo do final da lista. 
	 * Caso a lista esteja vazia, deve retornar null.
	 */
	public DNode removeTail() {

		if (size == 0) {
			return null;

		} else if (size == 1) {
			DNode v = trailer.prev; // nodo que será removido
			v.next = null;
			v.prev = null;

			trailer = null; // lista fica vazia
			header = null;

			size--;
			return v;
		} else {
			DNode v = trailer.prev; // nodo que será removido
			trailer.prev.prev.next = trailer; // atualiza apontadores
			trailer.prev = trailer.prev.prev;

			v.next = null;
			v.prev = null;

			size--;
			return v;
		}
	}


	/*
	 * Retorna uma string com os itens da lista.
	 */
	public String toString() {
		String s = "";

		if (size > 0) {
			DNode nodoAtual = header.next;

			// Pecorre os nodos da lista
			while (nodoAtual != trailer) {
				s += nodoAtual.element;
				s += " ";
				nodoAtual = nodoAtual.next;
			}
		}
		return s.trim();
	}


	/*
	 * Retorna uma string com os itens da lista em ordem reversa.
	 */
	public String toStringReverse() {
		String s = "";

		if (size > 0) {
			DNode nodoAtual = trailer.prev;

			// Pecorre os nodos da lista
			while (nodoAtual != header) {
				s += nodoAtual.element;
				s += " ";
				nodoAtual = nodoAtual.prev;
			}
		}
		return s.trim();
	}


	/*
	 * EXERCICIO 1: 
	 * Insere um nodo no início da lista.
	 */
	public void addHead(int element) {
		
				DNode v = new DNode(element);
				
				if (size == 0) 
				{
					header = new DNode(null);
					trailer = new DNode(null);
					
					header.next = v;
					trailer.prev = v;

					v.next = trailer;
					v.prev = header; 
				} 
				else 
				{

					v.prev = header;
					v.next = header.next;
					header.next.prev = v;
					header.next = v;
				}
				size++;
	}


	/*
	 * EXERCICIO 2:
	 * Remove e retorna o nodo do início da lista.
	 * Caso a lista esteja vazia, deve retornar null.
	 */
	public DNode removeHead() {
		
		if (size == 0) 
		{
			return null;

		} 
		else if (size == 1) 
		{
			DNode v = trailer.prev; 
			v.next = null;
			v.prev = null;

			trailer = null; 
			header = null;

			size--;
			return v;
		} 
		else 
		{
			DNode v = header.next; 
			header.next.next.prev = header; 
			header.next = header.next.next;

			v.next = null;
			v.prev = null;

			size--;
			return v;
		}
		
	}


	/*
	 * EXERCICIO 3:
	 * Busca por um valor na lista.
	 * Deve retornar true, caso o valor se encontre na lista.
	 * Deve retornar false, caso o valor não se encontre na lista
	 */
	public boolean find(int value) {
		
		if (size == 0) 
		{
			return false;
		}
		
		else
		{
			DNode nodoAtual = header.next;

			while (nodoAtual != trailer) 
			{
				if(value == nodoAtual.element) 
				{
					return true;
				}
				nodoAtual = nodoAtual.next;
			}
		}
		return false;
	}
	


	/*
	 * EXERCICIO 4: 
	 * Busca por um valor e remove a primeira ocorrencia encontrada.
	 * Deve retornar o nodo removido. 
	 * Caso a lista esteja vazia, deve retornar null.
	 * Caso o valor não seja encontrado, deve retornar null.
	 */
	public DNode removeItem(int value) {
		if (size == 0) 
		{
			return null;

		} 
		else if (size == 1) 
		{
			DNode nodoAtual = header.next;
			if(nodoAtual.element == value)
			{
				nodoAtual.next = null;
				nodoAtual.prev = null;

				trailer = null; 
				header = null;

				size--;
				return nodoAtual;	
			}
			return null;
			
		} 
		else 
		{
			DNode nodoAtual = header.next;
			while (nodoAtual != trailer) 
			{
				if(value == nodoAtual.element) 
				{
					nodoAtual.next.prev = nodoAtual.prev;
					nodoAtual.prev.next = nodoAtual.next;
					nodoAtual.next = null;
					nodoAtual.prev = null;
					size--;
					return nodoAtual;
					
				}
				nodoAtual = nodoAtual.next;
			}
		}
		return null;
	}


	/*
	 * EXERCICIO 5: 
	 * Insere um valor em um índice específico da lista.
	 * Considere que os índices indicam a posição de cada nodo na lista.
	 * Considere que o primeiro nodo está no índice zero.
	 */
	public void insert(int value, int index) {
		
		DNode v = new DNode(value);
		DNode nodoAtual = header.next;
		
		if (index == 0) 
		{	
			v.prev = header;
			v.next = nodoAtual;
			header.next = v;
			nodoAtual.prev = v;
		} 
		else 
		{
			for(int i = 0; i != index; i++)
			{
				nodoAtual = nodoAtual.next;
				
			}
			v.next = nodoAtual;
			v.prev = nodoAtual.prev;
			nodoAtual.prev.next = v;
			nodoAtual.prev = v;

		}
		size++;
	}

	
}
