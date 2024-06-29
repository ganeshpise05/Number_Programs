package Number_Programs;

import java.util.Scanner;

//Reverse the given number.
public class Reverse_Number {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to reverse: ");
	        int a = scanner.nextInt();

	        int b = 0;
	        while (a != 0) {
	            int digit = a % 10;
	            b = b * 10 + digit;
	            a /= 10;
	        }

	        System.out.println("Reversed number: " + b);

	}
}
