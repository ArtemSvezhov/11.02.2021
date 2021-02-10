package sample;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{
    private Stage stage;
    private AnchorPane anchorPane;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        anchorPane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setScene(new Scene(this.anchorPane));
        stage.setTitle("Задания");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
class NumericGenerator {
    private SimpleStringProperty num1;
    private SimpleStringProperty num2;

    public NumericGenerator(String num1, String num2) {
        this.num1 = new SimpleStringProperty(num1);
        this.num2 = new SimpleStringProperty(num2);
    }

    public NumericGenerator() {
        this.num1 = new SimpleStringProperty("0");
        this.num2 = new SimpleStringProperty("0");
    }

    public String getNum1() {
        return num1.get();
    }

    public void setNum1(String num1) {
        this.num1.set(num1);
    }

    public String getNum2() {
        return num2.get();
    }

    public void setNum2(String num2) {
        this.num2.set(num2);
    }
}
