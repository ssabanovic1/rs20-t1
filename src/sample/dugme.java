package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.awt.*;

public class dugme {
    public Label labela;
    public GridPane pozadina;

    public void klik(ActionEvent actionEvent) {
        labela.setText("Hello World!");
        labela.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 32));

    }
}
