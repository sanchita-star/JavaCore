//Create a HashSet of 5 integers.

//Try adding duplicate values and observe the result.

import java.util.Arrays;
import java.util.HashSet;

public class Setuniqueness {
public static void main(String[] args) {
	HashSet<Integer> s=new HashSet<>(Arrays.asList(1,2,3,4,5,1,2));
	System.out.println(s);
}
}
