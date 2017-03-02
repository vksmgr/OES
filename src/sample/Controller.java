package sample;

import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

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

    @FXML
    private Label labelTitle;

    @FXML
    private Label labelTimer;

    @FXML
    private JFXButton buttonCalculator;

    @FXML
    private ImageView imageViewProfile;

    @FXML
    private Label labelProfileId;

    @FXML
    private WebView webView;

    @FXML
    void buttonCalculatorOnClick(ActionEvent event) {

    }

    @FXML
    void buttonClearOnClick(ActionEvent event) {

    }

    @FXML
    void buttonFinishOnClick(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void buttonMarkForReviewOnClick(ActionEvent event) {

    }

    @FXML
    void buttonSaveOnClick(ActionEvent event) {
        WebEngine engine = webView.getEngine();
        engine.load("https://google.com");
    }

}
