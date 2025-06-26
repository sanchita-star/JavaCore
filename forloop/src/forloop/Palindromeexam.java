package forloop;

public class Palindromeexam {
public static void main(String[] args) {
	int num=121;
	int temp=num;
	int rev = 0,rem=0;
	while(temp !=0) {
		rem=temp%10;
		rev= rev * 10+rem;
		temp=temp/10;
	}
	if(num==rev) {
		System.out.println("given is palindrome");
	}
	else {
		System.out.println("not palindrome");
	}

}
}
