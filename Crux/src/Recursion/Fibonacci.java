package Recursion;

public class Fibonacci {

	public static void main(String[] args) {
		
	System.out.println(Fib(3));

	}
	public static int Fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int fib1 = Fib(n-1);
		int fib2 = Fib(n-2);
		int f = fib1+fib2;
		return f;
		
	}

}
