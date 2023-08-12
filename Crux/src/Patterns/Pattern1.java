package Patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		for(int row=1; row<n+1; row++) {
			for(int nst=0; nst<row; nst++) {
			System.out.print("*");
			
		}
			System.out.println();
		}

	}

}
