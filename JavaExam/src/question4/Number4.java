package question4;

import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a any words: ");

		String sentence = sc.nextLine();
		
		int count = 0;

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Number of vowels in the given sentence is " + count);
		
		
	}
}