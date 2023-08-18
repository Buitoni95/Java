// Arvore Binária de Busca
public class BST {

	// Insere um novo nodo na árvore
	public void insert(TNode root, int value) {

		TNode newNode = new TNode(value); // Cria um novo nó

		if (root == null) { // Insere na raiz
			root = newNode;
		} else if (newNode.value >= root.value) {
			// Nó é inserido na subárvore direita
			if (root.right == null) { // Se é uma folha, insere
				root.right = newNode;
			} else {
				insert(root.right, newNode.value);// Chamada recursiva
			}
		} else {
			// Nó é inserido na subárvore esquerda
			if (root.left == null) { // Se é uma folha, insere
				root.left = newNode;
			} else {
				insert(root.left, newNode.value);// Chamada recursiva
			}
		}
	}

	// Percurso Pré-Ordem: imprime primeiro o conteúdo da raiz, em seguida imprime
	// toda a subárvore esquerda e finalmente imprime toda a subárvore direita
	public void preOrder(TNode root) {
		if (root == null) { // É uma folha
			return;
		} else {
			System.out.print(root.value + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	// Percurso inOrder (simétrico): imprime toda a subárvore esquerda, em seguida
	// imprime o
	// conteúdo da raiz e finalmente imprime toda a subárvore direita
	public void inOrder(TNode root) {
		if (root == null) { // É uma folha
			return;
		} else {
			inOrder(root.left);
			System.out.print(root.value + " ");
			inOrder(root.right);
		}
	}

	// Percurso Pós-Ordem: imprime toda a subárvore esquerda, em seguida imprime
	// toda a subárvore direita e finalmente imprime o conteúdo da raiz
	public void postOrder(TNode root) {
		if (root == null) { // É uma folha
			return;
		} else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.value + " ");
		}
	}

	/*
	 * Se percorrermos uma árvore de forma simétrica e acompanharmos em qual nível
	 * na árvore estamos, podemos gerar uma representação gráfica da árvore. O
	 * parâmetro nível registra onde estamos na árvore. Por 'default', o nível
	 * inicialmente é zero. A cada chamada recursiva repassamos nivel + 1 porque o
	 * nível do filho é sempre um a mais do que o nível do pai. Cada item é
	 * indentado quatro espaços por nível. A arvore é exibida "deitada", com a raiz
	 * à esquerda.
	 */
	public void print(TNode root) {
		print(root, 0);
	}

	public void print(TNode root, int level) {
		if (root == null) {
			return;
		} else {
			print(root.right, level + 1);
			for (int i = 0; i < level; i++) {
				System.out.print("    ");
			}
			System.out.println(root.value);
			print(root.left, level + 1);
		}
	}

	// EXERCICIO 1:
	// Retornar a quantidade de nós de uma árvore.
	public Integer count(TNode raiz) {
		int qtd_no = 0; 
		if(raiz == null){
			return qtd_no;
		}
		else {
			qtd_no++;
			qtd_no += count(raiz.left);
			qtd_no += count(raiz.right);
		}
		return qtd_no;
	}

	// EXERCICIO 2:
	// Retornar o somatório dos valores de todos os nós de uma árvore
	public Integer sum(TNode raiz) {
		int soma = 0;
		if(raiz == null) {
			return soma;
		}
		else {
			soma += raiz.value;
			soma += sum(raiz.left);
			soma +=sum(raiz.right);
		}
		return soma;
	} 
	// EXERCICIO 3:
	// Retornar a altura de uma árvore
	public Integer height(TNode raiz) {
		int direita = 1;
		int esquerda = 1;
		if(raiz == null) {
			return 0;
		}
		else {
			
			esquerda += height(raiz.left);
			
			direita += height(raiz.right);
		}
		if (esquerda >= direita) {
			return esquerda;
		}
		else {
			return direita;
		}
	}

	// EXERCICIO 4:
	// Retornar o maior valor de uma árvore
	public Integer max(TNode raiz) {
		
		if(raiz == null) {
			return 0;
		}
		if(raiz.right == null) {
			return raiz.value;
		}
		else {
			return max(raiz.right);
		}
		

	}

	// EXERCICIO 5:
	// Retornar o menor valor de uma árvore
	public Integer min(TNode root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null) {
			return root.value;
		}
		else {
			return min(root.left);
		}
	}

	// EXERCICIO 6:
	// Realizar a busca por um determinado valor.
	// Retornar true se encontrar, e false se não encontrar.
	public boolean find(TNode root, Integer value) {
		if(root == null) {
			return false;
		}
		else if(root.value == value) {
			return true;
		}
		else {
			if(find(root.left, value) == true) {
				return true;
				
			}
			else {
				return find(root.right, value);
			}
		}
	}
}
