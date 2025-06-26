//Create a program where the user enters the number of wheels (2, 3, 4, 6) and displays the type of vehicle (Bike, Auto-Rickshaw, Car, Truck).

import java.util.Scanner;

public class SwitchExam2 {
	public static void main(String[] args) {
		
		System.out.println("enter wheels");
Scanner s =new Scanner(System.in);

int wheels= s.nextInt();
switch(wheels) {
case 2:
	System.out.println("bike");
	break;
case 3: 
	System.out.println("auto");
	break;
case 4:
	System.out.println("car");
case 6:
	System.out.println("truck");
}
	}
}
