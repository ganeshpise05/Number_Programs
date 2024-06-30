package Number_Programs;

public class Lcm_ofNumber {
	    
	    // Method to find the GCD of two numbers
	    public static int gcd(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return gcd(b, a % b);
	    }

	    // Method to find the LCM of two numbers
	    public static int lcm(int a, int b) {
	        return (a * b) / gcd(a, b);
	    }

	    // Method to find the LCM of three numbers
	    public static int lcmOfThreeNumbers(int a, int b, int c) {
	        int lcmAB = lcm(a, b);
	        return lcm(lcmAB, c);
	    }

	    public static void main(String[] args) {
	        int num1 = 12;
	        int num2 = 15;
	        int num3 = 20;

	        int lcm = lcmOfThreeNumbers(num1, num2, num3);
	        System.out.println("The LCM of " + num1 + ", " + num2 + ", and " + num3 + " is: " + lcm);
	    }
  
}
