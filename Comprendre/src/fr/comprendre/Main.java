package fr.comprendre;

import fr.comprendre.NodeList;

public class Main {

	public static void main(String[] args) {
		NodeList list = new NodeList();
		
		list.show();
//		System.out.println("Nombre d'éléments dans la liste : "+list.count());
		for(int i = 1 ; i<5 ; i++) {
			list.add(i);
		}
		list.show();
		list.pop();
		list.show();
		list.clear();
		list.show();
	}

}
