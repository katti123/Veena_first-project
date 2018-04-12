package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Print extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn=new Button("Click to add text");
		btn.setOnAction(e->click_button());
		StackPane root=new StackPane();
		root.getChildren().add(btn);
		Scene scene=new Scene(root,600,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World");
		primaryStage.show();
		
	}


public static void main(String[] args) {
	launch(args);
}

public void click_button()
{
	Stage window = new Stage();

    //window.initModality(Modality.APPLICATION_MODAL);
    String title="Your message ";
	window.setTitle(title);
    window.setHeight(300);
    window.setWidth(300);

    Label label = new Label();
    String message="Enter your concern in 300 words";
	label.setText(message);
  
    
    
    
    
    Scene scene = new Scene(label);
    
    window.setScene(scene);
    window.showAndWait();
}
}