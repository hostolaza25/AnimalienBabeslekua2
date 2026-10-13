package eus.adibidea;

public class MenuaKontroler {
    private MenuaView view;

    public MenuaKontroler(MenuaView view) {
        this.view = view;
        initListeners();
    }

    private void initListeners() {
        // Lógica para ir a la vista de añadir animal
        view.getBtnGehitu().setOnAction(e -> {
            GehituAnimaliaView gehituView = new GehituAnimaliaView();
            new GehituAnimaliaKontroler(gehituView);
            SceneManager.aldatuEszena(gehituView.getView(), "Gehitu Animalia");
        });

        // Lógica para mostrar los animales
        view.getBtnErakutsi().setOnAction(e -> {
            SceneManager.getBabeslekua().erakutsiAnimaliak();
        });
    }
}