package Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		for(int row=0; row<n; row++) {

			for(int nst=n-row; nst>0; nst--) {
				System.out.print("*");

			}
			System.out.println();
		}


	}

}
