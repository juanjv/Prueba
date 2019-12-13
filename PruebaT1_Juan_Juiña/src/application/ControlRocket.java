package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class ControlRocket {

	///Metodo para abrir otra entana
	@FXML
	private AnchorPane mypane;
	
	@FXML
	private void openStage() {
		
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Urano.fxml"));
			mypane = (AnchorPane)loader.load();
			Scene scene = new Scene(mypane);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	///Metodo para cerrar ventana
	
	@FXML
	public Button cerrar;
	@FXML
	private void closeStage() {
		Stage stage = (Stage) cerrar.getScene().getWindow();
	    stage.close();
	}
	//
	@FXML
	public Button closeButton;
	@FXML
	public void handleCloseButtonAction(ActionEvent event) {
	    Stage stage = (Stage) closeButton.getScene().getWindow();
	    stage.close();
	}
	
}
