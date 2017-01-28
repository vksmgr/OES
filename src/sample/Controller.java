package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button clickMe;
    @FXML
    private Label welcomeLable;

    public void clicked(ActionEvent actionEvent) {

        welcomeLable.setText("Welcome To India program");
    }
}
