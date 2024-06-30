package Number_Programs;

import java.util.Scanner;

//Find the count of digits of given number.

public class CountOf_Digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int count = countOfDigits( num);
		System.out.println("The count of digits of number "+num+" is "+count);
				
	}
	
	public static int  countOfDigits(int num) {
		
        int count = 0;
        if (num == 0) {
            return 1;
        }
        while (num != 0) {
            num /= 10;  // Remove the last digit
            count++;       // Increment the count
        }
        return count;

	}
}
