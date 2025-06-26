//Write a program to convert temperature from Celsius to Fahrenheit using the formula:

	import java.util.Scanner;

	public class Que5 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter temperature in Celsius: ");
	        double celsius = scanner.nextDouble();

	      
	        double fahrenheit = (celsius * 9 / 5) + 32;

	       
	        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

	        scanner.close();
	    }
	}


