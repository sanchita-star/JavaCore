
public class Assignmentope {
public static void main(String[] args) {
	//Write a Java program to demonstrate all assignment operators (=, +=, -=, *=, /=, %=).
	int a=4;
	a+=a;
	System.out.println(a);
	
	a*=a;
	System.out.println(a);
	a%=a;
	System.out.println(a);
	a/=a;//reminder
	System.out.println(a);
	a-=a;
	System.out.println(a);
	//Write a Java program to take an integer and update it step by step using assignment operators (+=, -=, *=, /=, %=) and display the intermediate results.
int b=5;
b+=b;
b-=b;
b*=b;
b/=b;
b%=b;
System.out.println(b);
}
}
