public class Loop100 {
	
	public static void main(String[] args) {
		
		for (int i=1; i<100;i+=2 ){
			
			System.out.println(i);
		}
		
		int n=0;
		
		do {
			System.out.println(n);
			n+=2;
		}while (n<=100);
	}
		}
