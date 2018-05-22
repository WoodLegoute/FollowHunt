package application;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LoginScreenController {

    @FXML
    private JFXTextField usernameField;

    @FXML
    private Label testPrompt;

    @FXML
    private JFXTextField passwordField;

    @FXML
    private Button login;

    @FXML
    private Button close;

    @FXML
    void loginButton(ActionEvent event) throws IOException {
        Parent lol = FXMLLoader.load(getClass().getResource("GatherPage.fxml"));
        Scene gather = new Scene(lol);
        Stage gatherStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        gatherStage.setScene(gather);
        gatherStage.initStyle(StageStyle.UNDECORATED);
        gatherStage.show();
    }

    @FXML
    void closeButton(ActionEvent event) {
    		
    	testPrompt.setText("This will close the app");
    }

}
