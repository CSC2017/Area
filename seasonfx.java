
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class seasonfx extends Application{

	public void start(Stage primaryStage){
		Button button =new Button("click");
		
		ChoiceBox <String>cb =new ChoiceBox<>();
		cb.getItems().addAll("December","Novermber", "October","September","August","July","June","May","April","March","Febuary","January");
		cb.setValue("December");
		
		button.setOnAction(e->{
			switch(cb.getValue()){
				case "December": case "January": case "Febuary":
					System.out.println("Do you want to build a snow man?");
					break;
				
				case "March": case "April": case "May":
					System.out.println( "Happy Spring days!");
					break;
				
				case "June": case "July": case "August":
					System.out.println("It’s a summer time.");
					break;

				case "September": case "October": case "Novermber":
					System.out.println( " Welcome to the foliage season!");
					break;
			}
			
			cb.setLayoutX(300);
			cb.setLayoutY(300);
			cb.show();
		});
		
		VBox vbox = new VBox();
		vbox.getChildren().addAll(cb,button);
		
		Scene scene=new Scene(vbox, 500,300);
		primaryStage.setTitle("season");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[]args){
		launch(args);
	}
}







