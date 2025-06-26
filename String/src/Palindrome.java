//program to check if given string is palindrome or not
public class Palindrome {
public static void main(String args[]) {
	StringBuffer rev=new StringBuffer("that");
	StringBuffer s =new StringBuffer(rev);
	s.reverse();
	
	if(rev == s) {
		System.out.println("this is palindrome");
	}
	else {
		System.out.println("this is not palindrome");
	}
}
}
