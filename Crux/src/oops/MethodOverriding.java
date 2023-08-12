package oops;

public class MethodOverriding {

	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1.2,3.4));
		System.out.println(sum(1.1,"hi"));
		System.out.println(sum(1,2,3,4,5));
		int[] arr = {1,2,3,4};
		System.out.println(sum(arr));
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	/*public static void sum(int a, int b) {
		System.out.println(a+b);
	}*/
	public static int sum(int a, int b,int c) {
		return a+b+c;
	}
	public static double sum(double a, double b) {
		return a+b;
	}
	public static double sum(double a, String s) {
		return a;
	}
	
	public static  int sum(int... args) {
		int sum =0;
		for(int val:args) {
			sum+=val;
		}
		return sum;
	}
	

}
