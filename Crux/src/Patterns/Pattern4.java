package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row=0; row<n; row++) {
			for(int nst=0; nst<row; nst++) {
				System.out.print(" ");
			}
			for(int nsp=0; nsp<n-row; nsp++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
