package forloop;

public class Forlooppractice {
public static void main(String[] args) {
	//Print Even Numbers from 2 to 100
	//Print all even numbers from 2 to 100 using only a for loop.

	for(int i=2;i<=100;i=i+2) {
		System.out.println(i);
	}
	//Sum of First N Natural Numbers
//	Calculate and print the sum of the first N natural numbers using a for loop.
	int n = 6,sum=0;
	for(int j=1;j<=n;j++) {
		System.out.println(sum=sum+j);	
	}
	//Print a Multiplication Table
	//Given a number N, print its multiplication table up to 10 using a for loop.
int n1=4;
for(int i=1;i<=10;i++) {
	System.out.println("table="+i*n1);
}
//Reverse Order Printing
//Print numbers from 100 to 1 in reverse order using a for loop.
for(int i=100;i>=1;i--) {
	System.out.println(i);
}
//Print the Fibonacci Series
//Print the first N terms of the Fibonacci series using a for loop.
int num1=0,num2=1,num=4;
for(int i=1;i<=num;i++) {
	int s = num1 + num2;
	num1=num2;
	num2=s;
	System.out.println(""+s);
}
//Reverse a Number
//Reverse the digits of a number using only a for loop.
int num4=12345;
int rev=0;
while(num4 != 0) {
	int digits=num4 % 10;
	rev= rev*10 + digits;
	num4= num4 /10;
	
}
System.out.println("rverse="+rev);
//Sum of Digits of a Number
//Find the sum of the digits of a given number using only a for loop.
int num5=123;
int sum2=0;
while(num5!=0) {
	int digits=num5%10;
	sum2=sum2+digits;
	num5=num5/10;
	System.out.println("sum2"+sum2);
}
}
}
