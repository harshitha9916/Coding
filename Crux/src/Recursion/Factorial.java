package Recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(Fact(4));
	}
	public static int Fact(int n) {
		if(n==1) {
			return 1;
		}
		int fnm1 = Fact(n-1);
		int f = n* fnm1;
		return f;
		//4* 3!
		
	}

}
