//Write a program to check whether a number is even or odd.

public class Ifelse1 {
public static void main(String[] args) {
	int re=5;
	if(re%2==0)
	{
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
	//Write a program to check whether a person is eligible to vote (age >= 18).
	int age=34;
	if(age>=18) {
		System.out.println("eligible for voting");
	}
	else {
		System.out.println("not eligible for voting");
	}
	//Write a program to find the largest of two numbers.
int num1=5,num2=10;
if(num1>num2) {
	System.out.println("num1 is greter");
}
else {
	System.out.println("num2 is greater");
}
//Write a program to check whether a character is a vowel or consonant.
char cha='e';
if(cha =='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u') {
	System.out.println("vowel");
}
else {
	System.out.println("consonant");
}
//Write a program to check whether a number is positive, negative, or zero.

int num=20;
if(num>0) {
	System.out.println("positive");
}
else if(num==0) {
	System.out.println("zero");
}
else
{
	System.out.println("negative");
}
//Write a program to assign grades to students based on their marks:
//90-100: A
//80-89: B
//70-79: C
//60-69: D
//Below 60: Fail
int marks=90;
if(marks>=90 && marks<=100) {
	System.out.println("A");
}
else if(marks>=80 && marks<=90) {
	System.out.println("B");
}
else if(marks>=70 && marks<=80) {
	System.out.println("C");
}
else if(marks>=60 && marks<=70) {
	System.out.println("D");
}
	else {
		System.out.println("failed");
	}

//Write a program to check whether a given year is a leap year or not.
int year=2025;
if(year%4==0 || year%100==0 && year%400==0) {
	System.out.println("leap");
}
else {
	System.out.println("not leap");
}
//Write a program to classify a person’s age group:
//0-12: Child
//13-19: Teenager
//20-59: Adult
//60 and above: Senior Citizen
int personage=56;
if(personage<12) {
	System.out.println("child");
}
else if(personage>12 && personage<19) {
	System.out.println("teenager");
}
else if(personage>20 && personage<59) {
	System.out.println("adult");
}
else {
	System.out.println("senior ");
}
//Write a program to determine the type of triangle (equilateral, isosceles, or scalar) based on user input sides.
int side1=1,side2=2,side3=3;
if(side1 == side2 && side2 == side3) {
	System.out.println("equilateral");
}else if(side1 ==side2 && side2!=side3 || side1!=side2 && side2==side3) {
	System.out.println("isoscles");
}else {
	System.out.println("scalar");
		
	}
//
}
}
