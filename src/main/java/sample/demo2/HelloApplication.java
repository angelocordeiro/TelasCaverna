package sample.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;


import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        HelloApplication.stage = stage;
    }

    public static Stage stage;

    public static Stage getInnerstage() {
        return innerstage;
    }

    public static void setInnerstage(Stage innerstage) {
        HelloApplication.innerstage = innerstage;
    }

    public static Stage innerstage;
    public static Parent root = null, addnew=null;
    double x,y = 0;
    @Override
    public void start(Stage primarystage) throws IOException {
        try {
            root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            addnew = FXMLLoader.load(getClass().getResource("addnew.fxml"));

        } catch (IOException ex) {
            Logger.getLogger(HelloApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);
        Scene scene2 = new Scene(addnew);
        setStage(primarystage);
        //HelloController.pStage = stage;
        //stage.initStyle(StageStyle.UNDECORATED);

        root.setOnMousePressed(evt ->{
            x = evt.getSceneX();
            y = evt.getSceneY();
        });
        root.setOnMouseDragged(evt ->{
            stage.setX(evt.getScreenX()- x);
            stage.setY(evt.getScreenY()- y);
        });
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        innerstage = new Stage(){{setScene(scene2);}};
        innerstage.setOnShown((WindowEvent e) -> {

        });

        innerstage.close();
    }

    public static void main(String[] args) {
        launch();
    }
}