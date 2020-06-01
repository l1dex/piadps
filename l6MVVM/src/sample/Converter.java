package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Converter extends Application {
    ModelView modelView = new ModelView();
    Button button = new Button("Convert");
    TextArea textAreaArabic = new TextArea("Arabic textarea");
    TextArea textAreaRoman = new TextArea("Roman textarea");
    EventHandler<ActionEvent> buttonHandler = event -> {
        backBind();
        bind();
    };

    protected void config(){
        textAreaArabic.setLayoutY(10);
        textAreaArabic.setLayoutX(10);
        textAreaArabic.setMaxSize(150,5);

        textAreaRoman.setLayoutX(310);
        textAreaRoman.setLayoutY(10);
        textAreaRoman.setMaxSize(150,5);
        textAreaRoman.setEditable(false);

        button.setLayoutX(200);
        button.setLayoutY(10);
        button.setOnAction(buttonHandler);
    }

    public void start(Stage primaryStage) throws Exception {
        config();
        root.getChildren().addAll(button,textAreaArabic,textAreaRoman);
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    Pane root = new Pane();


    HBox buttonBox = new HBox();


    final private int WIDTH = 470;
    final private int HEIGHT = 50;

    private void backBind(){
        modelView.setArabicNum(textAreaArabic.getText());
    }

    private void bind(){
        textAreaRoman.setText(modelView.getArabicNum());
    }
}


