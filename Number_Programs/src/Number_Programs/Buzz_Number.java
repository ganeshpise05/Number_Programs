package Number_Programs;

import java.util.Scanner;

//Buzz Number: A number which is divisible by 7 and ends with 7 .

public class Buzz_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
       
        if (checkBuzz(num)) {
			System.out.println("The given number "+ num + " is Buzz Number.");
		} else {
			System.out.println("The given number "+ num + " is notBuzz Number.");
		}
	}

	public static boolean checkBuzz(int num) {
		 
	   return (num%7==0 && num%10==7);
	 
	}
}
