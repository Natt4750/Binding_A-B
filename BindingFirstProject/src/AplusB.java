
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.beans.binding.StringBinding;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AplusB extends Application 
{
	
	@Override
	public void start(Stage primaryStage) 
	{
		
		Group group = new Group ();
		Scene scene = new Scene(group,400,400);
		
		Label lblplus = new Label();
		lblplus.setLayoutX(40);
		lblplus.setLayoutY(100);
		lblplus.setText("+");
		
		Label lblEqual = new Label();
		lblEqual.setLayoutX(80);
		lblEqual.setLayoutY(100);
		lblEqual.setText("=");
		
	  Label lblResult = new Label();
		lblResult.setLayoutX(100);
		lblResult.setLayoutY(100);
		
			
		
		
		Label lblA = new Label();
		lblA.setLayoutX(20);
		lblA.setLayoutY(100);
		
		TextField txtA = new TextField();
		txtA.setLayoutX(20);
		txtA.setLayoutY(60);
		

		txtA.textProperty().addListener((observable,oldValue,newValue) ->
		{
			lblA.setText(txtA.getText());
			 
		}
			
				);
		
		Label lblB = new Label();
		lblB.setLayoutX(60);
		lblB.setLayoutY(100);
		
		TextField txtB = new TextField();
		txtB.setLayoutX(20);
		txtB.setLayoutY(80);
		
		txtB.textProperty().addListener((observable,oldValue,newValue) ->
		{
			lblB.setText(txtB.getText());
			 
		}
			
				);
		
		  
		  
				
				  lblResult.textProperty().bind(new StringBinding() { {
				  super.bind(txtA.textProperty()); super.bind(txtB.textProperty()); }
				  
				  @Override public String computeValue() { return
				  String.valueOf(Integer.parseInt(txtB.getText())+Integer.parseInt(txtA.getText
				  ())); } });
				 
		 
		
	
				
		
				
				
		
		
		
		
		 
		
		
		
		
		
		
		
		
		group.getChildren().add(txtA);
		group.getChildren().add(txtB);
		group.getChildren().add(lblA);
		group.getChildren().add(lblB);
		group.getChildren().add(lblplus);
		group.getChildren().add(lblEqual);
		group.getChildren().add(lblResult);

		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	

	public static void main(String[] args) 
	{
		launch(args);
	}
}
