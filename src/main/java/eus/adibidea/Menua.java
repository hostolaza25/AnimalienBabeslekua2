package eus.adibidea;

import java.util.Scanner;

public class Menua {

    private Scanner Eskanerra;
    private Babeslekua babeslekua;

    public Menua() {
        this.Eskanerra = new Scanner(System.in);
        this.babeslekua = new Babeslekua();
        erakutsiMenuNagusia();
    }

    public void erakutsiMenuNagusia() {
        int aukera;
        do {
            System.out.println("--- ANIMALIEN BABESLEKUA ---");
            System.out.println("1. Animalia gehitu");
            System.out.println("2. Animaliak erakutsi");
            System.out.println("3. Animalia bilatu");
            System.out.println("4. Animalia adoptatu bezala markatu");
            System.out.println("5. Animalia ezabatu");
            System.out.println("0. Irten");
            System.out.print("Aukeratu zenbaki bat: ");

            aukera = Eskanerra.nextInt();
            Eskanerra.nextLine();

            switch (aukera) {
                case 1:
                    gehituAnimaliaProzesua();
                    break;
                case 2:
                    babeslekua.erakutsiAnimaliak();
                    break;
                case 3:
                    bilatuAnimaliaProzesua();
                    break;
                case 4:
                    adoptatuAnimaliaProzesua();
                    break;
                case 5:
                    ezabatuAnimaliaProzesua();
                    break;
                case 0:
                    System.out.println("Agur!");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriro.");
            }
        } while (aukera != 0);
    }

    public void gehituAnimaliaProzesua() {
        System.out.println("Sartu nahi duzun animaliaren zenbakia:");
        System.out.println("1. Txakurra");
        System.out.println("2. Katua");
        System.out.println("3. Untxia");

        int aukera = Eskanerra.nextInt();
        Eskanerra.nextLine();

        System.out.println("Sartu izena: ");
        String izena = Eskanerra.nextLine();

        System.out.println("Sartu adina: ");
        int adina = Eskanerra.nextInt();

        System.out.println("Sartu pisua: ");
        double pisua = Eskanerra.nextDouble();
        Eskanerra.nextLine();

        Animalia animaliaBerria = null;

        if(aukera == 1){
            animaliaBerria = new Txakurra(izena, adina, pisua);
        } else if (aukera == 2){
            animaliaBerria = new Katua(izena, adina, pisua);
        } else if (aukera == 3){
            animaliaBerria = new Untxia(izena, adina, pisua);
        }

        if(animaliaBerria != null) {
            babeslekua.gehituAnimalia(animaliaBerria);
            System.out.println(">> Animalia ondo gehitu da babeslekura!");
        } else {
            System.out.println(">> Errorea: Aukera ez da zuzena.");
        }
    }

    public void bilatuAnimaliaProzesua() {
        System.out.print("Sartu bilatu nahi duzun animaliaren izena: ");
        String izena = Eskanerra.nextLine();
        Animalia aurkitua = babeslekua.bilatuAnimalia(izena);

        if (aurkitua != null) {
            System.out.println(">> Aurkituta: " + aurkitua);
        } else {
            System.out.println(">> Ez da animaliarik aurkitu izen horrekin.");
        }
    }

    public void adoptatuAnimaliaProzesua() {
        System.out.print("Sartu adoptatu den animaliaren izena: ");
        String izena = Eskanerra.nextLine();
        Animalia aurkitua = babeslekua.bilatuAnimalia(izena);

        if (aurkitua != null) {
            babeslekua.adoptatuAnimalia(aurkitua);
            System.out.println(">> Animalia adoptatutzat markatu da!");
        } else {
            System.out.println(">> Ez da animalia aurkitu.");
        }
    }

    public void ezabatuAnimaliaProzesua() {
        System.out.print("Sartu ezabatu nahi duzun animaliaren izena: ");
        String izena = Eskanerra.nextLine();
        Animalia aurkitua = babeslekua.bilatuAnimalia(izena);

        if (aurkitua != null) {
            babeslekua.ezabatuAnimalia(aurkitua);
            System.out.println(">> Animalia ezabatu da.");
        } else {
            System.out.println(">> Ez da animalia aurkitu.");
        }
    }
}