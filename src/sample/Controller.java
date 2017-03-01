package sample;

import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class Controller {


    @FXML
    private BorderPane mainWindow;

    @FXML
    private HBox footerHbox;

    @FXML
    private JFXButton buttonMarkForReview;

    @FXML
    private JFXButton buttonClear;

    @FXML
    private JFXButton buttonSave;

    @FXML
    private JFXButton buttonFinish;

    @FXML
    private HBox hederHbox;



    public void buttonMarkForReviewOnClick(ActionEvent actionEvent) {
    }

    public void buttonClearOnClick(ActionEvent actionEvent) {
    }

    public void buttonSaveOnClick(ActionEvent actionEvent) {
    }

    public void buttonFinishOnClick(ActionEvent actionEvent) {
        Platform.exit();
    }
}
