//Write a Java program to add, subtract, multiply, and divide two numbers entered by the user.

import java.util.Scanner;

public class Question1 {
    int num1, num2;
    Scanner s = new Scanner(System.in);

    public void Add() {
        System.out.println("Enter number one");
        num1 = s.nextInt(); // Use instance variable
        System.out.println("Enter number two");
        num2 = s.nextInt(); // Use instance variable
        int add1 = num1 + num2;
        System.out.println("Add = " + add1);
    }

    public void Sub() {
        int sub1 = num1 - num2;
        System.out.println("Sub = " + sub1);
    }

    public void Mult() {
        int mult1 = num1 * num2;
        System.out.println("Mult = " + mult1);
    }

    public void Div() {
        if (num2 != 0) {
            int div1 = num1 / num2;
            System.out.println("Div = " + div1);
        } else {
            System.out.println("Can't divide by 0");
        }
    }

    public static void main(String args[]) {
        Question1 q = new Question1();
        q.Add();
        q.Sub();
        q.Mult();
        q.Div();
    }
}
