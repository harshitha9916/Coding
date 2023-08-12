package Recursion;

public class Power {

	public static void main(String[] args) {
		System.out.println(Pow(2,4));

	}
	public static int Pow(int x, int n) {
		if(n==0) {
			return 1;
		}
		int pnm1 = Pow(x,n-1);
		int p = x * pnm1;
		return p;
		

	}

}
