package eus.adibidea;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {
    private static Stage primaryStage;
    private static Babeslekua babeslekua = new Babeslekua(); // Instancia única del refugio compartida en toda la app

    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }

    public static Babeslekua getBabeslekua() {
        return babeslekua;
    }

    public static void aldatuEszena(Parent root, String titulua) {
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle(titulua);
        primaryStage.show();
    }
}