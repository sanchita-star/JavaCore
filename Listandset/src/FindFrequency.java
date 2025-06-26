//Given a List of integers, find the frequency of each number using a Set and Collections.frequency().

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFrequency {
public static void main(String[] args) {
	List<Integer> l =new ArrayList<>(Arrays.asList(1,2,2,4,7,5,6));
	Set<Integer> s=new HashSet<>(l);
	for(int num:s) {
		int freq=Collections.frequency(l, num);
		System.out.println("number="+num+"frequency="+freq);
	}
	
}
}
