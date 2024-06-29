package Number_Programs;

//Fibonacci series
public class Fibonacci_Series {

	public static void main(String[] args) {
		
	 int a = 0;
	 int b = 1;
	 int n = 20;
	 
	 for (int i = 0; i < n; i++) {
		 
		 System.out.print(a+" ");
		int nextNum = a+b;
		a = b ;
		b = nextNum;
	 }
	}
}
