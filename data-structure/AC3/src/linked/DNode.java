

package linked;
public class DNode {

	public Integer element; // assume que os elementos são inteiros
	public DNode next;
	public DNode prev;

	// Cria um novo nodo
	public DNode(Integer elem) {
		element = elem;
		next = null;
		prev = null;
	}
}