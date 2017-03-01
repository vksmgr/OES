package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //this will remove title bar
        primaryStage.initStyle(StageStyle.UNDECORATED);

        //this willl set the window size to full screen
        primaryStage.setFullScreen(true);

        //after mini mize this will set the size and it will locad the fxml layout of the window
        primaryStage.setScene(new Scene(root,800,600));
        //primaryStage.setMaximized(true);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        /*Thread thread = new Thread();
        thread.start();*/
    }
}
