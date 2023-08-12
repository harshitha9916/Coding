package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row=0;row<(n-1)/2;row++) {

			for(int nst=0;nst<((n-1)/2)-row;nst++) {
				System.out.print("*");				
			}
			for(int nsp=0;nsp<row+1+row;nsp++) {
				System.out.print(" ");				
			}
			for(int nst=0;nst<((n-1)/2)-row;nst++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		System.out.println();
		int c=n-2;
		for(int row=0;row<(n-1)/2;row++) {
			
			for(int nst=0;nst<row+1;nst++) {
				System.out.print("*");				
			}
			//System.out.print(c);
			
			while(c>0) {
				System.out.print(" ");
				c--;
			}
			
			for(int nst=0;nst<row+1;nst++) {
				System.out.print("*");				
			}
			c=n-(2*(row+2));
			
			System.out.println();
		}
		

	}

}
