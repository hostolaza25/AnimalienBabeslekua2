package eus.adibidea;

import java.util.ArrayList;

public class Babeslekua {

    private ArrayList<Animalia> animaliak;

    public Babeslekua() {
        this.animaliak = new ArrayList<>();
    }

    // GEHITU METODO HAU HEMEN:
    public ArrayList<Animalia> getAnimaliak() {
        return animaliak;
    }

    public void gehituAnimalia(Animalia a) {
        animaliak.add(a);
    }

    public void adoptatuAnimalia(Animalia a) {
        a.setAdoptatua(true);
    }

    public void ezabatuAnimalia(Animalia a) {
        animaliak.remove(a);
    }

    public Animalia bilatuAnimalia(String izenaBilatu) {
        for (Animalia a : animaliak) {
            if (a.getIzena().equalsIgnoreCase(izenaBilatu)) {
                return a;
            }
        }
        return null;
    }

    public void erakutsiAnimaliak() {
        for (int i = 0; i < animaliak.size(); i++) {
            System.out.println(animaliak.get(i));
        }
    }
}