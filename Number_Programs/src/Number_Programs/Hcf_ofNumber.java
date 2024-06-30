package Number_Programs;

import java.util.Scanner;

/* Write a program to find the Highest common factor of given Number
 * list factors of given number [18:1,2,3,6,9,18 and 24:1,2,3,4,6,8..] 
 * find common factors [1,2,3,6]
 * largest number from common factor is HCF of given number.
 */
public class Hcf_ofNumber {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner (System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int hcf = hcfOfNumber(a,b);
        System.out.println("The HCF of numbers "+a+" and "+b+" is: "+hcf);
	}

	public static int  hcfOfNumber(int a,int b) {
		 if (b == 0) {
	            return a;
	        }
	        return hcfOfNumber(b, a % b);
	}
}
