//password alphabet digit symbol

import java.util.Scanner;

public class June26 {
public static void main(String[] args) {
	String password;
	String letter="";
	String number="";
	String symbol="";
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the password");
	password=s.nextLine();
	for(int i=0;i<password.length();i++) {
		
		char c =password.charAt(i);
		if(Character.isLetter(c)) {
			letter=letter+c;
		}
			else if(Character.isDigit(c)) {
				number=number+c;
			}
				else {
					symbol=symbol+c;
				}
			System.out.println("letters are"+letter);
			System.out.println("numbers are"+number);
			System.out.println("symbols are"+symbol);
			}
	}
}

