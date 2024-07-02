package Number_Programs;

import java.util.Scanner;

//Prime Number : The number which is divisible by 1 and itself . 2,3,5,7,11

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		if ( num<=1) {
			isPrime = false;
		} 
		
		else {
			for (int i = 2; i<num; i++) {
				
				if (num%i==0) {
					isPrime = false;
					break;
				} 		
			}
		}
		
		if (isPrime) {
			System.out.println("The number "+num+" is prime number.");
		} 
		
		else {
			System.out.println("The number "+num+" is not prime number!!");
		}
		
	}
}
