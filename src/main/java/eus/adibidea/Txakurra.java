package eus.adibidea;

// Extends erabili Animali klaseko atributuak ibili al izateko
public class Txakurra extends Animalia{
    // Konstruktorea da hau
    public Txakurra (String izena, int adina, double pisua) {
        //Konstruktoreak funtzionatu ahla izateko super erabili behar da.
        super (izena,adina,pisua);
        setEspeziea("Txakurra");
    }

    @Override
         public void eginSoinua(){
            System.out.println("guau guau");
         }
}
