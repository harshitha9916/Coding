package AssignmentPatterns;

public class Q3 {

	public static void main(String[] args) {
		int n = 5; 
		for(int row=0; row<n; row++) {
			for(int nst=n-row; nst>0; nst--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
