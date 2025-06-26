//Write a Java program to remove duplicate elements from a List using a Set.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicate {
public static void main(String[] args) {
	List<Integer> l = new ArrayList<>();  //given list
	l.add(12);
	l.add(13);
	l.add(14);
	l.add(12);
	l.add(15);
	System.out.println(l);
	Set<Integer>  s=new HashSet<>();  //set removes duplicates
	s.addAll(l);
	List<Integer> li=new ArrayList<>();
	li.addAll(s);
	System.out.println(li);   //lastly printed as list
}

}
