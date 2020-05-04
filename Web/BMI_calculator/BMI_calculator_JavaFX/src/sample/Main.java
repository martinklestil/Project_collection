package sample;

import controll.Auswertung;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import view.BmiDescriLabel;
import view.BmiResult;

import java.util.EventListener;

public class Main extends Application {

    private GridPane bmiPane = new GridPane();
    private Label bmiResult;
    private Label bmidescri;

    @Override
    public void start(Stage primaryStage) throws Exception{


        Label discriptionTitle = new Label("Erklärung");
        Label discription = new Label("Ein kleines Projekt um den Einsatz von Java und JavaFX zu zeigen.");
        BorderPane titlePane = new BorderPane ();
        titlePane.setTop(discriptionTitle);
        titlePane.setCenter(discription);

        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL, 10 , 10);

        GridPane mainPane = new GridPane();
        Label gewichtText = new Label("Gewicht: ");
        TextField gewichtValue = new TextField();
        Label heightText = new Label("Körpergröße: ");
        TextField heightValue = new TextField();

        mainPane.add(heightText, 0,1);
        mainPane.add(heightValue, 1, 1);
        mainPane.add(gewichtText, 0,3);
        mainPane.add(gewichtValue, 1,3);

        Label bmiText = new Label("BMI: ");
        Label bmiErklärung = new Label("Ihr BMI ist: ");
        bmiResult = BmiResult.getInstance();
        bmidescri = BmiDescriLabel.getInstance();
        bmiPane.add(bmiText, 0 , 0);
        bmiPane.add(bmiResult,1,0);
        bmiPane.add(bmiErklärung, 0 , 1);
        bmiPane.add(bmidescri,1,1);
        bmiPane.setVisible(false);


        Button berechnen = new Button("BMI Berechnen");
        berechnen.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Auswertung auswertung = new Auswertung(heightValue.getText(), gewichtValue.getText());
                bmiPane.setVisible(true);
            }
        });

        RowConstraints rc1 = new RowConstraints(50, 100, 200);

        GridPane root = new GridPane();
        root.add(titlePane, 0, 0);
        root.add(mainPane, 0, 1);
        root.add(berechnen, 0,2);
        root.add(bmiPane,0,3);
        root.getRowConstraints().add(rc1);
        primaryStage.setTitle("BMI Calculator with JavaFX");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
