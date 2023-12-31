package linked;
public class LinkedList {

	public Node head = null; // nodo cabeça da lista

	// Adiciona item no início (cabeça)
	public void addHead(int elem) {
		// Cria um novo nodo com o dado a ser armazenado.
		Node v = new Node(elem);

		if (head == null) { // lista vazia
			head = v; // define o novo nodo como cabeça da lista
		} else { // lista não vazia
			v.next = head; // novo nodo aponta para a cabeça da lista
			head = v;
		}
	}

	// Adiciona item no fim (cauda)
	public void addTail(int elem) {
		// Cria um novo nodo com o dado a ser armazenado.
		Node v = new Node(elem);

		if (head == null) { // lista vazia
			head = v; // define o novo nodo como cabeça da lista
		} else {
			// percorre nodos da lista
			Node nodoAtual = head;
			while (nodoAtual.next != null) {
				nodoAtual = nodoAtual.next;
			}
			nodoAtual.next = v;
		}
	}

	// Remove item do início (cabeça)
	public void removeHead() {
		if (head != null) { // lista não vazia
			head = head.next; // altera a cabeça para o próximo
		}
	}

	// Remove item do fim (cauda)
	public void removeTail() {
		if (head != null) { // lista não vazia
			if (head.next == null) { // apenas 1 nodo
				head = null;
			} else { // mais que 1 nodo
				Node nodoAtual = head;
				Node nodoAnterior = null;

				// percorre os nós até o penultimo nodo
				while (nodoAtual.next != null) {
					nodoAnterior = nodoAtual; // atualiza o nodo anterior
					nodoAtual = nodoAtual.next; // atualiza o nodo atual
				}
				nodoAnterior.next = null; // remove ultimo nodo
			}
		}
	}

	// Busca um item na lista
	public boolean search(int elem) {
		Node nodoAtual = head;

		// percorre os nós da lista
		while (nodoAtual != null) {
			// verifica se encontrou o item
			if (nodoAtual.element == elem) {
				return true;
			}
			nodoAtual = nodoAtual.next; // atualiza o nodo atual
		}
		// terminou a lista e não encontrou
		return false;
	}

	// Retorna uma string contendo os itens da lista
	// separados por um espaço em branco
	public String print() {
		String s = "";
		Node nodoAtual = head;

		// Pecorre os nodos da lista
		while (nodoAtual != null) {
			s += nodoAtual.element;
			s += " ";
			nodoAtual = nodoAtual.next;
		}

		return s.trim(); // trim: remove espaços em branco do começo e do final
	}

	// Retorna o tamanho da lista
	public int size() {
		Node nodoAtual = head;
		int cont = 0;
		while (nodoAtual != null) { // percorre os nós da lista
			nodoAtual = nodoAtual.next;
			cont += 1;
		}
		return cont;
	}

	// Retorna o menor item da lista
	public int min() {
		if (head == null) {
			return 0;
		}
		Node nodoAtual = head;
		int menor = nodoAtual.element;
		while (nodoAtual != null) { // percorre os nós da lista
			if (nodoAtual.element < menor) {
				menor = nodoAtual.element;
			}
			nodoAtual = nodoAtual.next;
		}
		return menor;
	}

	// Remove um item da lista
	public void removeItem(int value) {
		if (head != null) {
			Node nodoAtual = head;
			Node nodoAnterior = null;

			while (nodoAtual != null) { // percorre os nós da lista

				if (nodoAtual.element == value) {
					if (nodoAnterior == null) { // é o primeiro item
						head = nodoAtual.next;
						break;
					} else {
						nodoAnterior.next = nodoAtual.next;
						break;
					}
				}

				nodoAnterior = nodoAtual;
				nodoAtual = nodoAtual.next;
			}
		}
	}
	
	// EXERCICIO 1:
	// Implemente o método 'sum' que retorna o somatório dos itens da lista.
	// Caso a lista esteja vazia, deve retornar 0.
	public int sum() {
		int soma = 0;	
		if (head == null)
		{
			return soma;
		}
		Node nodoAtual = head;
		while(nodoAtual != null) 
		{
			soma += nodoAtual.element;
			nodoAtual = nodoAtual.next;
		}
		return soma;
	}
	
	// EXERCICIO 2:
	// Implemente o método 'mean' que retorna a média dos itens da lista.
	// Caso a lista esteja vazia, deve retornar 0.
	public int mean() {
		int soma = 0;
		int contagem = 0;
		if(head == null)
		{
			return 0;
		}
		Node nodoAtual = head;
		while(nodoAtual != null)
		{
			soma += nodoAtual.element;
			contagem ++;
			nodoAtual = nodoAtual.next;
		}
		int media = soma / contagem;
		return media;
	}
	
	// EXERCICIO 3:
	// A profundidade de um nó N em uma lista encadeada é a distância entre
	// N e o início da lista. Mais precisamente, a profundidade é a quantidade
	// de nós que vai do primeiro nó da lista até N.
	// Implemente o método 'depth' que recebe um valor e retorna a
	// profundidade da primeira ocorrencia desse valor na lista.
	// Caso a lista esteja vazia deve retornar 0.
	// Caso o valor não esteja contido na lista, deve retornar -1.
	public int depth(int value) {
		int profundidade = 0;
		if(head == null)
		{
			return 0;
		}
		Node nodoAtual = head;
		while(nodoAtual != null)
		{
			if(nodoAtual.element == value)
			{
				return profundidade;
			}
			nodoAtual = nodoAtual.next;
			profundidade++;
		}
        return -1;
	}
	
	// EXERCÍCIO 4:
	// Implemente o método 'reverse' que inverte os nós de uma lista encadeada
	// (o primeiro passa a ser o último, o segundo passa a ser o penúltimo, etc.)
	// Se a lista estiver vazia, nada deve ser alterado nada na lista.
	public void reverse() {
		Node nodoAtual = head;
		int tamanho = 0;
		int itemHead= 0;
		int itemTail = 0;
		int inicio = 1;
		int posicaoAntiga = 0;
		if(head != null)
		{		
			//pega tamanho
			while(nodoAtual != null)
			{
				tamanho += 1;
				nodoAtual = nodoAtual.next;
			}
			
			nodoAtual = head;
			itemHead = nodoAtual.element;
			if(nodoAtual.next != null)
			{
				while(inicio <= tamanho)
				{	//vai para o fim
					for(int i = inicio; i <= tamanho; i++ )
					{
						if(i == tamanho)
						{
							itemTail = nodoAtual.element;
							nodoAtual.element = itemHead;
						}
						else
						{
							nodoAtual = nodoAtual.next;
						}
					}
					
					nodoAtual = head;
					for(int i = 0; i <= posicaoAntiga; i++)
					{
						if(i == posicaoAntiga)
						{
							nodoAtual.element = itemTail;
						}
						else
						{
							nodoAtual = nodoAtual.next;
						}
					}
					
					nodoAtual = head;
					for(int i = 0; i <= inicio; i++)
					{
						if(i == inicio)
						{	
							itemHead = nodoAtual.element;
							
						}
						else
						{
							nodoAtual = nodoAtual.next;
						}
					}
					
					// vai para o final da lista

					inicio += 1;
					posicaoAntiga += 1;
					tamanho -=1;
				}
			}
		}	
	}
}
