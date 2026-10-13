package eus.adibidea;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MenuaView {
    private VBox view;
    private Button btnGehitu;
    private Button btnErakutsi;

    public MenuaView() {
        view = new VBox(10);
        view.setAlignment(Pos.CENTER);

        Label lbl = new Label("MENU NAGUSIA");
        btnGehitu = new Button("Animalia Gehitu");
        btnErakutsi = new Button("Animaliak Erakutsi Kontsolan");

        view.getChildren().addAll(lbl, btnGehitu, btnErakutsi);
    }

    public Parent getView() {
        return view;
    }

    public Button getBtnGehitu() {
        return btnGehitu;
    }

    public Button getBtnErakutsi() {
        return btnErakutsi;
    }
}
