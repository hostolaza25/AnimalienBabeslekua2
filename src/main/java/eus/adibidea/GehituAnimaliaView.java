package eus.adibidea;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class GehituAnimaliaView {
    private VBox view;
    private TextField txtIzena;
    private TextField txtAdina;
    private TextField txtPisua;
    private Button btnGorde;
    private Button btnAtzera;

    public GehituAnimaliaView() {
        view = new VBox(10);
        view.setAlignment(Pos.CENTER);

        txtIzena = new TextField();
        txtIzena.setPromptText("Izena");

        txtAdina = new TextField();
        txtAdina.setPromptText("Adina");

        txtPisua = new TextField();
        txtPisua.setPromptText("Pisua");

        btnGorde = new Button("Gorde");
        btnAtzera = new Button("Atzera");

        view.getChildren().addAll(txtIzena, txtAdina, txtPisua, btnGorde, btnAtzera);
    }

    // Este es el método que faltaba y que da el error rojo:
    public Parent getView() {
        return view;
    }

    public TextField getTxtIzena() { return txtIzena; }
    public TextField getTxtAdina() { return txtAdina; }
    public TextField getTxtPisua() { return txtPisua; }
    public Button getBtnGorde() { return btnGorde; }
    public Button getBtnAtzera() { return btnAtzera; }
}