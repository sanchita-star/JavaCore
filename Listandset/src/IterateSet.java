//Create a Set of strings.

//Use an Iterator to display all the elements.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateSet {
public static void main(String[] args) {
	Set<String> s= new HashSet<>();
	s.add("ram");
	s.add("shyam");
	s.add("rahul");
	s.add("sanket");
	s.add("anup");
	
Iterator<String> it=s.iterator();
while(it.hasNext())
System.out.println(it.next());

}
}
