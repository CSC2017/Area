public class diamond {
	
	public static void main(String[] args) {
		int n = 1;
		int m = 3;
		int k=3;
		int t=3;
		
		while (m > 0) {

			for (int j = m; j > 0; j--) {
				System.out.print(" ");
			}
			
			for (int i = 1; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println();
			
			n += 2;
			m--;
		}
		
		while (k < 6) {
			for (int j = k; j > 1; j--) {
				
				System.out.print(" ");
			}
			for (int i = 1; i <= t; i++) {
				System.out.print("*");
			}
			System.out.println();
			t -= 2;
			k++;
		}
	}
}
		
		
																																																																																																																			
