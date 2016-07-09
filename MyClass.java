package Project1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		//import scanner
		Scanner scanner = new Scanner(System.in);
		
		//ask the user for input using the Scanner Object
		System.out.print("Please enter a number: ");
		
		//assign user input a variable
		int userInput = scanner.nextInt();
		int reverseNum = 0;
		int remainder;
		
		//userInput will enter the while loop one number at a time, until it reaches 0
		while(userInput !=0) {
			
			remainder = userInput % 10;
			reverseNum = reverseNum * 10 + remainder;
			userInput = userInput / 10;
			
		}
		
		//print the reverse number
		System.out.println("The reverse of your number is: " + reverseNum);

	}

}
