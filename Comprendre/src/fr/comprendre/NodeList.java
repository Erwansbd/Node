package fr.comprendre;

public class NodeList {
	private Node first;
	
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(first == null) {
			first = newNode;
			return;
			
		}
		Node n = first;
		while(n.next != null) {
			n = n.next;
		}
		n.next = newNode;
	}
	
	public void show() {
		if(first == null) {
			System.out.println("La liste est vide");
			return;
		}
		for(Node n = first ; n != null ; n = n.next) {
			System.out.println(n.data);
		}
	}
	
	public void pop() {
		if(first == null) {
			return;
		} 
//		System.out.println(""+first);
		if(first.next != null) {
			int result = first.data;
			first = first.next;
			System.out.println("La valeur supprimée est : "+result);
//			System.out.println(""+first);
		}
	}
	public void clear() {
		if(first!=null) {
			first = null;
		}
	}
}
