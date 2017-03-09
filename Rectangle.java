import java.util.Optional;
import javafx.application.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
public class Rectangle extends Application{
		public void start (Stage primaryStage){

	        TextInputDialog inputDialog = new TextInputDialog();
		inputDialog.setTitle("Enter Your number");
		inputDialog.setHeaderText("Perimeter");
		inputDialog.setContentText("Enter You Height");

		Optional <String> result = inputDialog.showAndWait();
		inputDialog.setTitle("Enter Your number");
		inputDialog.setHeaderText("Perimeter");
         	inputDialog.setContentText("Enter You Width");

		Optional <String> r1 = inputDialog.showAndWait();

         	double Height = Double.parseDouble(result.get());
		double Width = Double.parseDouble(r1.get());
 
 																										 	          Alert alert= new Alert (AlertType.INFORMATION);
 		alert.setTitle("Height");
		alert.setTitle("Width");
		alert.setContentText("you perimeter is" + 2*(Height + Width));
		alert.showAndWait();


		alert.setTitle("Height");
         	alert.setTitle("Width");
		alert.setContentText("You Area is" + Height* Width);
		alert.showAndWait();
																											}
}
