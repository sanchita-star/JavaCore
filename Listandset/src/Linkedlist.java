//Use LinkedList to add 5 city names.

//Add an element at the beginning and at the end.

import java.util.LinkedList;

public class Linkedlist {
public static void main(String[] args) {
	LinkedList<String> l = new LinkedList<>();
	l.add("Latur");
	l.add("Pune");
	l.add("Udgir");
	l.add("Udgir");
	l.add("Udgir");
	System.out.println("before add"+l);
	l.addFirst("UK");
	System.out.println("addatbegin"+l);
	l.addLast("KS");
	System.out.println("addatend"+l);
}
}
