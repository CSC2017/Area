import javax.swing.JOptionPane;
    public class login {
       public static void main(String [] args){
	       String username= JOptionPane.showInputDialog(null,"Enter Your Username");
		String password= JOptionPane.showInputDialog(null, "Enter Your Password");
		if((username.equals("Jing"))&&password.equals("c123")){
	        JOptionPane.showMessageDialog(null,"Welcome Jing!");      
	        }else{
		 JOptionPane.showMessageDialog(null,"Wrong Usename or Password!");
       }
     }
   }
