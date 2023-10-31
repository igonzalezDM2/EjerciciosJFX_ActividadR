package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import widget.Temoporizador;

public class CuestionarioController implements Initializable {

    @FXML
    private Button btnEnviar;

    @FXML
    private Temoporizador temporizador;

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf10;

    @FXML
    private TextField tf11;

    @FXML
    private TextField tf12;

    @FXML
    private TextField tf13;

    @FXML
    private TextField tf14;

    @FXML
    private TextField tf15;

    @FXML
    private TextField tf16;

    @FXML
    private TextField tf17;

    @FXML
    private TextField tf18;

    @FXML
    private TextField tf19;

    @FXML
    private TextField tf2;

    @FXML
    private TextField tf20;

    @FXML
    private TextField tf3;

    @FXML
    private TextField tf4;

    @FXML
    private TextField tf5;

    @FXML
    private TextField tf6;

    @FXML
    private TextField tf7;

    @FXML
    private TextField tf8;

    @FXML
    private TextField tf9;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		temporizador.getFin().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				btnEnviar.setDisable(newValue);
			}
		});
		
		temporizador.tiempo(1);
	}

}
