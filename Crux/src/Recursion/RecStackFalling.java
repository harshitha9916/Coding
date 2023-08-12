package Recursion;

public class RecStackFalling {

	public static void main(String[] args) {
		PrintIncreasing(5);

	}
	public static void PrintIncreasing(int n) {
		if(n==0) {
			return ;
		}
		
		PrintIncreasing(n-1);
		System.out.println(n);
	}
}
