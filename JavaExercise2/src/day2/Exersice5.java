package day2;

import java.util.Scanner;

public class Exersice5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		
		int num1 = input.nextInt();
		
		System.out.println("Please enter first number: ");
		
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		
		int differnce = num1 - num2;

		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + differnce);
	}

}
