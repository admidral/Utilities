/**
                                                                                                                                   * Jul 30, 2015  input.java  Poon

 */
package Utilities;

import java.util.*;

@SuppressWarnings("resource")
public final class input {
	/**
	 * Syntax and usage of Library Each Command will be using the format input.*
	 * where * is the input format The system will check that it is in the
	 * correct format before returning the input to the main program The syntax
	 * used to use the code is variable = input.*() where the variable is your
	 * variable to input in the main program and the * is the format for the
	 * input
	 * 
	 * Format input types input.words--- Input String input.integer--- input Int
	 * input.posetiveinteger--- input Posetive Int (Excludes 0)
	 * input.negativeinteger--- input Negative Int (Excludes 0) input.decimal---
	 * input double input.posetivedecimal--- input Posetive double (Excludes 0)
	 * input.negativedecimal--- input Negative double (Excludes 0) say:
	 * input.digit---input posetive one digit
	 */

	public static int integer() {
		int a = 0;

		System.out.println("Please enter an Integer");

		Scanner userchoice = new Scanner(System.in);// importing the scanner
		while (!userchoice.hasNextInt()) {
			userchoice.next(); // this is important!
			System.out.println("Please retry entering the Integer");
		}// checks whether it is a int and will retry until is int
		a = userchoice.nextInt();

		return a;
	}

	public static double decimal() {
		double a = 0;
		System.out.println("Please enter a number");
		Scanner userchoice = new Scanner(System.in);// importing the scanner
		while (!userchoice.hasNextDouble()) {
			userchoice.next(); // this is important!
			System.out.println("Please retry entering the number");
		}// checks whether it is a int and will retry until is int
		a = userchoice.nextDouble();
		return a;
	}

	public static int posetiveinteger() {
		int a = -1;
		Scanner userchoice = new Scanner(System.in);// importing the scanner
		System.out.println("Please enter a posetive Integer");

		while (a < 0) {

			while (!userchoice.hasNextInt()) {
				userchoice.next(); // this is important!
				System.out.println("Please retry entering a posetive Integer");
			}// checks whether it is a int and will retry until is int
			a = userchoice.nextInt();
			if (a < 0) {
				System.out.println("Please make sure the number is posetive");
			}
		}
		return a;

	}
	public static int digit() {
		int a = -1;
		Scanner userchoice = new Scanner(System.in);// importing the scanner
		System.out.println("Please enter a digit");

	
		while (a < 0 || a > 10) {
		
			while (!userchoice.hasNextInt()) {
				userchoice.next(); // this is important!
				System.out.println("Please retry entering a posetive Integer");
			}// checks whether it is a int and will retry until is int
			a = userchoice.nextInt();
			if (a < 0) {
				System.out.println("Please make sure the number is posetive");
			}
			if (a > 10){
				System.out.println("Please make sure it is a digit");
			}
		}
		
		return a;

	}

	public static int negativeinteger() {
		int a = 1;
		Scanner userchoice = new Scanner(System.in);// importing the scanner
		System.out.println("Please enter a negative Integer");

		while (a > 0) {

			while (!userchoice.hasNextInt()) {
				userchoice.next(); // this is important!
				System.out.println("Please retry entering a negative Integer");
			}// checks whether it is a int and will retry until is int
			a = userchoice.nextInt();
			if (a > 0) {
				System.out.println("Please make sure the Integer is negative");
			}
		}
		return a;

	}

	public static double posetivedecimal() {
		double a = -1;
		Scanner userchoice = new Scanner(System.in);// importing the scanner
		System.out.println("Please enter a posetive number");

		while (a < 0) {

			while (!userchoice.hasNextDouble()) {
				userchoice.next(); // this is important!
				System.out.println("Please retry entering the posetive number");
			}// checks whether it is a int and will retry until is int

			a = userchoice.nextDouble();
			if (a < 0) {
				System.out.println("Please make sure the number is posetive");
			}
		}
		return a;
	}

	public static double negativedecimal() {
		double a = 1;
		Scanner userchoice = new Scanner(System.in);// importing the scanner
		System.out.println("Please enter a negative number");

		while (a > 0) {

			while (!userchoice.hasNextDouble()) {
				userchoice.next(); // this is important!
				System.out.println("Please retry entering the negative number");
			}// checks whether it is a int and will retry until is int
			a = userchoice.nextDouble();
			if (a > 0) {
				System.out.println("Please make sure the number is negative");
			}

		}
		return a;

	}

	public static boolean truefalse() {
		boolean a;
		System.out.println("Please enter true or false");
		Scanner userchoice = new Scanner(System.in);// importing the scanner
		while (!userchoice.hasNextBoolean()) {
			userchoice.next(); // this is important!
			System.out.println("Please retry entering true or false");
		}// checks whether it is a int and will retry until is int
		a = userchoice.nextBoolean();
		return a;
	}

	public static String words() {
		String a;
		System.out.println("Please enter:");
		Scanner userchoice = new Scanner(System.in);// importing the scanner
		while (!userchoice.hasNextLine()) {
			userchoice.next(); // this is important!
			System.out.println("Please retry");
		}// checks whether it is a int and will retry until is int
		a = userchoice.nextLine();
		return a;
	}

}