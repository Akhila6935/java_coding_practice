package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating scanner object
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter any String: "); 
		String inputString = scanner.nextLine();
		// closing scanner class 
		scanner.close();
		//creating reversed string
		String reversedString = "";
		for (int i= inputString.length()-1; i>=0; i--) {
			reversedString += inputString.charAt(i);
		}
		//printing the result
		System.out.println("Reversed string: " + reversedString);
		
 
    }
}



