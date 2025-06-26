//Store random integers in a TreeSet.

//Display them in ascending order.

import java.util.Arrays;

import java.util.TreeSet;

public class Treeset {
public static void main(String[] args) {
	TreeSet<Integer> t = new TreeSet<>(Arrays.asList(3,4,2,1,3));
	System.out.println(t);
}
}
