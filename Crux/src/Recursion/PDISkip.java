package Recursion;

public class PDISkip {

	public static void main(String[] args) {
		PDI(5);

	}
	public static void PDI(int n) {
		if(n==0) {
			return ;
		}
		if (n%2 !=0) {
		System.out.println(n);
		}
		PDI(n-1);
		if (n %2==0) {
		System.out.println(n);
		}
		
	}

}
