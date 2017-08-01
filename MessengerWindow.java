package MessengerWindow;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class MessengerWindow extends Application{
	@Override
	public void start(Stage stage){
		GridPane root = new GridPane();
		Scene scene = new Scene(root, 300, 200);
		//testing testing eclipse
		TextField tf = new TextField("Graphics the Hard Way!");
		Button btn = new Button("Print Message");
		btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				System.out.println(tf.getText());
			}
		});

		root.setAlignment(Pos.CENTER);
		root.setVgap(20);;
		
		root.add(tf,  0,  0);;
		root.add(btn,  0,  1);
		
		root.setHalignment(btn,  HPos.CENTER);
		
		stage.setTitle("Messanger Window");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String [] args){
		launch(args);
	}
	
	
}
