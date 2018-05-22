package application;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class _DriverNotified extends Application {

	Stage window;
	Scene login, gather;

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		URL url = _DriverNotified.class.getResource("notified_login.fxml");
		
		AnchorPane login = FXMLLoader.load(url);
		
		window.setScene( new Scene(login) );
		window.initStyle(StageStyle.UNDECORATED);
		window.show();
		
	}

	/*public static void showGatherPage() throws Exception {

        URL url = _DriverNotified.class.getResource("GatherPage.fxml");

        AnchorPane gather = FXMLLoader.load(url);

        window.setScene( new Scene(gather) );
        window.show();
    }*/

}
