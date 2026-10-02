package eus.adibidea;

public class Katua extends Animalia{

    public Katua (String izena, int adina, double pisua){
        super (izena,adina,pisua);
        setEspeziea("katua");

    }

    @Override
    public void eginSoinua(){
        System.out.println("miau miau");
    }
}
