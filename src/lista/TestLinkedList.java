package lista;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Beltrano");
		list.add("Fulano");
		
		//list.remove("Fulano");
		
		System.out.println(list.toString());
		
		System.out.println(list.size());
		
		list.addFirst("Paulo");
		
		System.out.println(list.toString());
		
	}
	
}
