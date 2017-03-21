
import javafx.application.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
public class Demo extends Application {

	    @Override
	        public void start(Stage primaryStage) {
			         
				
	             TextInputDialog inputD =new TextInputDialog();
	             Alert alert= new Alert(AlertType.INFORMATION);
                     int hc =0;
			     do{
				     inputD.setTitle("Log in");                                            
				     inputD.setHeaderText("login");
	                             inputD.setContentText("Enter you name");
				     inputD.showAndWait();
				     String r = inputD.getResult();
				     
				     inputD.setTitle("Log in");
				     inputD.setHeaderText("login");
				     inputD.setContentText("Enter pw");
				     inputD.showAndWait();
				     String r1 = inputD.getResult();
				     System.out.println(r+r1);
				     
				     if (r.equals("jing") && r1.equals("C123")){
				     alert.setContentText("Welcome");
				     alert.showAndWait();
				     hc=0;
			            
			             }else{
					     alert.setContentText("invaild");
					     alert.showAndWait();
					     hc++;
				     }
			     }while (hc<3);
			     
			     alert.setContentText("Contact Administrator");
			     alert.showAndWait();
		}
}
