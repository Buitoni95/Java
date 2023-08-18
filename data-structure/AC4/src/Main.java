
public class Main {

	public static void main(String[] args) {

		// Cria uma nova árvore
		BST tree = new BST();

		// Cria a raiz da arvore
		TNode root = new TNode(42);

		// Insere outros itens
		tree.insert(root, 16);
		tree.insert(root, 57);
		tree.insert(root, 8);
		tree.insert(root, 35);
		tree.insert(root, 48);
		tree.insert(root, 11);
		tree.insert(root, 5);
		tree.insert(root, 9);

		// exibe a árvore
		tree.print(root);
		System.out.println("\n");

		// exibe em pré ordem
		tree.preOrder(root);
		System.out.println("\n");

		// exibe em pós ordem
		tree.postOrder(root);
		System.out.println("\n");

		// exibe em ordem
		tree.inOrder(root);
		System.out.println("\n");
	}
}