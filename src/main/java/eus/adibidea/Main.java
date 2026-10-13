package eus.adibidea;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        // Configuramos el escenario principal en el SceneManager
        SceneManager.setPrimaryStage(stage);

        // Creamos la vista del menú y le asociamos su controlador
        MenuaView menuaView = new MenuaView();
        new MenuaKontroler(menuaView);

        // Mostramos la primera escena
        SceneManager.aldatuEszena(menuaView.getView(), "Animalien Babeslekua");
    }

    public static void main(String[] args) {
        launch(args);
    }
}