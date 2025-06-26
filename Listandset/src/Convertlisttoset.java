//Convert a List of names to a Set to remove duplicates.

//Print the original and the converted collections.

import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

public class Convertlisttoset {
	
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();  //given list
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(12);
		l.add(15);
		System.out.println("original"+l);
		Set<Integer>  s=new HashSet<>();  //set removes duplicates
		s.addAll(l);
		
		System.out.println("set conversion"+s);   
	
	
	}

}
