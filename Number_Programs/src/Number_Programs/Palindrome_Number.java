package Number_Programs;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a palindrome: ");
        int a = sc.nextInt();
        int originalNumber = a;
        int b = 0;

        while (a != 0) {
            int digit = a % 10;
            b = b * 10 + digit;
            a /= 10;
        }

        if (originalNumber == b) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
	}
}
