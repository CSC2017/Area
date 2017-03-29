import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.stage.Stage;



public class math extends Application {
	public void start (Stage primaryStage){
		TextInputDialog input = new TextInputDialog();
		Alert alert = new Alert(AlertType.INFORMATION);
	
		input.setTitle("Math");
		input.setHeaderText("Enter a Number");
		input.showAndWait();
		int number = Integer.parseInt(input.getResult());
		int count = number;
		int factorial = number;

		if (count<0){
			
			alert.setTitle("Factorial");
			alert.setContentText("No Negative Number");
			alert.showAndWait();
		
		}else if (count==0){
			
			alert.setContentText("The Factorical is 1");
			alert.showAndWait();
		
		}while (count>1){
			
			factorial = factorial *(count-1);
			
			alert.setTitle("Factorial");
			alert.setContentText("The Factorial of " + number + " is " + factorial);
			count--;
			alert.showAndWait();
		}
		
		int odd=0;
		int oddCount;
		
		if (number%2==0){
			
			oddCount = number-1;
		
		} else {
			
			oddCount = number;
		}

		for (count=oddCount;count>0;count=count-2){
			
			odd=odd+count;
		}
		
		alert.setTitle("Odd sum");
		alert.setContentText("The sum of all odd numbers within " + number + " is " + odd);
		alert.showAndWait();

		int fib1 = 0;
		int fib2 = 1;
		int fibonacci=0;
		
		for (count=number;count>0;count--){
		
			fibonacci = fib1+fib2;
			fib2= fib1;
			fib1=fibonacci;
		}
		
		alert.setTitle("Fibonacci Number");
		alert.setContentText("The Fibonacci number of " + number + " is " + fibonacci);
		alert.showAndWait();
	}
}


