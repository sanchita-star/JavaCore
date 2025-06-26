//Create a List of 5 country names and sort them alphabetically.

import java.util.ArrayList;

import java.util.List;

public class SortList {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("India");
	l.add("Bharat");
	l.add("Hindustan");
	l.add("WestIndies");
	l.add("Nepal");
	System.out.println("before"+l);
	
	l.sort(null);
	System.out.println("after"+l);
}
}
