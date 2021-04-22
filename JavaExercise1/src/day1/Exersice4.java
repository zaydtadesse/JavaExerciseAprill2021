package day1;

public class Exersice4 {

	public static void main(String[] args) {

		/*
		 * 4.Write a Java program to print the result of the following operations. a. -5
		 * + 8 * 6 b. (55+9) % 9 c. 20 + -3*5 / 8 d. 5 + 15 / 3 * 2 - 8 % 3
		 */

		// Question#4A

		int numa1 = -5;
		int numa2 = 8;
		int numa3 = 6;

		System.out.println(numa1 + numa2 * numa3);

		// Question#4B
		/* b. (55+9) % 9 */

		int numb1 = 55;
		int numb2 = 9;
		int numb3 = 9;

		System.out.println((numb1 + numb2) % numb3);

		// Question#4C

		/* c. 20 + -3*5 / 8 */

		int numc1 = 20;
		int numc2 = -3 * 5;
		int numc3 = 8;
		System.out.println(numc1 + numc2 / numc3);

		// Question#4D
		/* d. 5 + 15 / 3 * 2 - 8 % 3 */

		int numd1 = 5;
		int numd2 = 15;
		int numd3 = 3;
		int numd4 = 2;
		int numd5 = -8;
		int numd6 = 3;

		System.out.println(numd1 + numd2 /numd3 * numd4 + numd5 % numd6);

	}

}
