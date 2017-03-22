import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class role extends Application {
	    
	public void start(Stage primaryStage){
		primaryStage.setTitle("Account Type");
		Label unameLable = new Label("Username");
		Label pwLable = new Label("Password");
		Label accLabel = new Label("Select your account type");

		TextField unameTxtField = new TextField();
		PasswordField pwTxtField = new PasswordField();

		ObservableList<String> options = FXCollections.observableArrayList("Administrator", "Staff", "Faculty", "Student","Guest");
		ComboBox acTypeComboBox = new ComboBox(options);

	        Button signInButton = new Button("Sign In");
		signInButton.setOnAction(e->{
			String displayStr = "";
			Font welcomeFont = new Font("Time in Rome", 20);
			
			if(unameTxtField.getText().equals("csc200") && pwTxtField.getText().equals("C123")) {
				String acType = (String)acTypeComboBox.getValue();
				
				if (acType.equals("Student")) {
					displayStr = "Welcome " + acType;
				} else {
					displayStr = "Incorrect Account Type!";
				}	
			} else { 
				displayStr = "Fail Authentication!";
			}
			
			Label welcomeLabel = new Label(displayStr);
			welcomeLabel.setFont(welcomeFont);
			
		        Scene welcomeScene = new Scene(welcomeLabel);
			Stage welcomeStage = new Stage();
			
			welcomeStage.setScene(welcomeScene);
			welcomeStage.show();
		});
		
		VBox vbox = new VBox();
		vbox.getChildren().addAll(unameLable,unameTxtField,pwLable,pwTxtField,accLabel,acTypeComboBox,signInButton);
		Scene scene = new Scene(vbox, 400,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	        public static void main(String [] args) {
			        launch(args);
				    }

		}
