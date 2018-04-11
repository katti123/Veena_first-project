package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Print extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn=new Button("Add your text");
		
		StackPane root=new StackPane();
		root.getChildren().add(btn);
		Scene scene=new Scene(root,600,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}


public static void main(String[] args) {
	launch(args);
}
}