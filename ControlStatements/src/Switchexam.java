
public class Switchexam {
public static void main(String[] args) {
	//Write a program that takes a color (Red, Yellow, Green) as input and prints the corresponding action (Stop, Slow Down, Go).
String color="Red";
	switch(color){
	case "Red":
		System.out.println("stop");
	break;
	case "Yellow":
		System.out.println("slow");
		break;
	case "Green":
		System.out.println("go");
		default:
			System.out.println("went wrong");
		
}
	//Implement a menu-driven program where the user selects a recharge plan (1: Data Plan, 2: Talktime Plan, 3: SMS Pack) and displays the price accordingly.
	String plan ="TalktimePlan";
	switch (plan) {
	case "Data Plan":
		System.out.println("20");
		break;
	case "Talktime Plan":
		System.out.println("34");
		break;
	case "SMS Plan":
		System.out.println("45");
		break;
		default:
			System.out.println("choose plan");}
	//Take the class type (1: General, 2: Sleeper, 3: AC) as input and print the fare details for each class.
String classt="Sleeper";
switch(classt) {
case "General":
	System.out.println("less");
	break;
case "Sleeper":
	System.out.println("medium");
	break;
case "AC":
	System.out.println("high");
	default:
		System.out.println("no");
}
//Implement a game system where a user selects a difficulty level (1: Easy, 2: Medium, 3: Hard) and prints a message accordingly.

String difficulty="easy";
switch(difficulty) {
case "easy":
	System.out.println("easyyyyyy");
	break;
case "medium":
	System.out.println("medium"); 
	break;
case "hard":
	System.out.println("hardddddd");
	break;
	default:
		System.out.println("over");}
//Take a season (1: Summer, 2: Winter, 3: Rainy) as input and print the appropriate advisory message (Stay Hydrated, Wear Warm Clothes, Carry an Umbrella).

String season="Winter";
switch(season) {
case "Summer":
System.out.println("summer.......");
break;
case "Winter":
	System.out.println("winterrrr");
	break;
case "Rainy":
	System.out.println("rainyyyy");
	break;
	default:
		System.out.println("healthy stay");
}
//
}


}
