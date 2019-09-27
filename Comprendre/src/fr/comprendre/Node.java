package fr.comprendre;

public class Node {
	public int data;
	public Node next = null;
	public Node(int data) {
		this.data = data;
	}
	public Node() {
		
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
