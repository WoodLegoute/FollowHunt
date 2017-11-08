package application;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class _DriverTreeViewCounty extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		URL url = _DriverTreeViewCounty.class.getResource("TreeViewCounty.fxml");
		
		AnchorPane mainPane = FXMLLoader.load(url);
		
		primaryStage.setScene( new Scene(mainPane) );
		primaryStage.show();
		
	}

}
