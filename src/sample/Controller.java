package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {


    @FXML
    private Button buttonClose;


    public void buttonCloseOnClick(ActionEvent actionEvent) {
        Platform.exit();
    }
}
