package day2;

import java.util.Scanner;

public class Exersice3 {

	public static void main(String[] args) {
		
		//System.out.print("Please enter the number to know whether it is positive or negative: ");

		// Prompt the user
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		
		int num = input.nextInt();

		
		 if
		      (num >= 0) {
			System.out.println("The number you enter is Positive: ");
		} else {
			System.out.println("The number you enter is Negative: ");
		}
		
		input.close();

	}

}
