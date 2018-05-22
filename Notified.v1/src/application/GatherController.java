package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GatherController {

    @FXML
    private Button closebtn;

    @FXML
    void closebtnclicked(ActionEvent event) {
        Platform.exit();
    }

}
