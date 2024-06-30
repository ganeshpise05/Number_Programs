package Number_Programs;

import java.util.Scanner;

//Write a program to find the sum of the digits of a given number.
public class SumOfDigitsof_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num  = sc.nextInt();
		
		int result = sumOfDigits(num);
		System.out.println("The sum of digits of number "+ num+ " is: "+ result);
	}
	
	  // Method to find the sum of digits of a given number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;  // Add the last digit to sum
            number /= 10;        // Remove the last digit
        }
        return sum;
    }
}
