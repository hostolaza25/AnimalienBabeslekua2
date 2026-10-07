package eus.adibidea;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BabeslekuaGUI extends Application {

    private Babeslekua babeslekua;
    private TableView<Animalia> tabla;

    @Override
    public void start(Stage primaryStage) {
        babeslekua = new Babeslekua();

        // ==========================================
        // 1. HASIERako ESZENA (Pantalla principal / Menú)
        // ==========================================n
        VBox panelHasiera = new VBox(15);
        panelHasiera.setAlignment(Pos.CENTER);
        panelHasiera.setPadding(new Insets(20));

        Label lblTitulua = new Label("ANIMALIEN BABESLEKUA");
        lblTitulua.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Button btnJoanTaulara = new Button("Animalien Zerrenda Ikusi");
        panelHasiera.getChildren().addAll(lblTitulua, btnJoanTaulara);

        Scene eszenaHasiera = new Scene(panelHasiera, 400, 300);


        // ==========================================
        // 2. TAULAREN ESZENA (Bigarren pantaila)
        // ==========================================
        VBox panelTaula = new VBox(10);
        panelTaula.setPadding(new Insets(15));

        tabla = new TableView<>();

        TableColumn<Animalia, String> colIzena = new TableColumn<>("Izena");
        colIzena.setCellValueFactory(new PropertyValueFactory<>("izena"));

        TableColumn<Animalia, String> colEspeziea = new TableColumn<>("Espeziea");
        colEspeziea.setCellValueFactory(new PropertyValueFactory<>("espeziea"));

        TableColumn<Animalia, Integer> colAdina = new TableColumn<>("Adina");
        colAdina.setCellValueFactory(new PropertyValueFactory<>("adina"));

        TableColumn<Animalia, Double> colPisua = new TableColumn<>("Pisua");
        colPisua.setCellValueFactory(new PropertyValueFactory<>("pisua"));

        TableColumn<Animalia, Boolean> colAdoptatua = new TableColumn<>("Adoptatua");
        colAdoptatua.setCellValueFactory(new PropertyValueFactory<>("adoptatua"));

        tabla.getColumns().addAll(colIzena, colEspeziea, colAdina, colPisua, colAdoptatua);

        // Botoiak behean
        HBox panelBotoiak = new HBox(10);
        Button btnGehitu = new Button("Adibide Animalia Gehitu");
        Button btnItzuliHasierara = new Button("<< Hasierara Itzuli"); // Botoi hau da hasierako scene-ra eramango zaituena
        Button btnEzabatu = new Button("Ezabatu");

        panelBotoiak.getChildren().addAll(btnGehitu, btnItzuliHasierara, btnEzabatu);

        panelTaula.getChildren().addAll(new Label("Babeslekuko Animalien Zerrenda:"), tabla, panelBotoiak);

        Scene eszenaTaula = new Scene(panelTaula, 550, 400);


        // ==========================================
        // 3. BOTOIEN EKINTZAK (SetOnAction)
        // ==========================================

        // Hasierako botoiak taulako eszenara eramaten zaitu
        btnJoanTaulara.setOnAction(e -> {
            primaryStage.setScene(eszenaTaula);
        });

        // Taulako botoiak HASIERAKO ESZENARA itzultzen zaitu (Hau da eskatu duzuna!)
        btnItzuliHasierara.setOnAction(e -> {
            primaryStage.setScene(eszenaHasiera);
        });

        // Beste botoien funtzionalitateak
        btnGehitu.setOnAction(e -> {
            Animalia a = new Txakurra("Max", 3, 12.5);
            babeslekua.gehituAnimalia(a);
            tabla.getItems().setAll(babeslekua.getAnimaliak());
        });

        btnEzabatu.setOnAction(e -> {
            Animalia hautatua = tabla.getSelectionModel().getSelectedItem();
            if (hautatua != null) {
                babeslekua.ezabatuAnimalia(hautatua);
                tabla.getItems().setAll(babeslekua.getAnimaliak());
            }
        });


        // ==========================================
        // Hasieran, aplikazioa hasierako eszenarekin irekitzen da
        // ==========================================
        primaryStage.setTitle("BABESLEKUA - Kudeaketa");
        primaryStage.setScene(eszenaHasiera);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}