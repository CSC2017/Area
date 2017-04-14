import javax.swing.JOptionPane;

public class MATH1 {
		public static void main (String[]args){
		
			double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter n1"));
			JOptionPane.showMessageDialog(null,  n1 +" 's tenth power is "+ powerten(n1));

			double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter n2"));
			JOptionPane.showMessageDialog(null, n1 +" and "+ n2 +" sum is " + sum(n1,n2));

			double n3=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter n3"));
			JOptionPane.showMessageDialog(null, "the square of" +n1 +"the abs of" +n2 +"the power of " + n3 + comb(n1,n2,n3));

																}
		public static double powerten(double x){
				return (x*x*x*x*x*x*x*x*x);
				}

		public static double sum (double x,double y){
				return(x+y);

				}
		public static double sqrt (double x){
				double root =Math.sqrt(x);
					return (root);
					}
		public static double abs (double y){
				return ((y>=0)? y:(y*-1));

				}
		public static double comb(double x, double y,double z){
				return (sqrt(x)+abs(y)+ Math.pow(z,y));
				}


		}


