package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class Controlador implements Initializable {
    // atributos
    @FXML
    private Label etiqueta1;

    @FXML
    private Label etiqueta2;

    @FXML
    private Label etiqueta3;

    @FXML
    private Label etiqueta4;

    @FXML
    private Label etiqueta5;

    @FXML
    private Pane pane1;

    @FXML
    private Pane pane2;

    @FXML
    private AnchorPane root;

    @FXML
    private VBox vbox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    void etiquetaSeleccionada(MouseEvent event) {

    }

}