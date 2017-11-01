package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    private ObservableList<Persona> listapersonas;
    public TextField Buscar;
    public Label Nombre;
    public Label Apellido;
    public Label Edad;

    public Controller() {
    }




    public void enviar(ActionEvent actionEvent) {

        try {
            System.out.println(Persona.buscarNombre(this.Buscar.getText()));

        } catch (NullPointerException var3) {
            System.out.println("NO HAY NINGUN NOMBRE");
        }




    }

}
