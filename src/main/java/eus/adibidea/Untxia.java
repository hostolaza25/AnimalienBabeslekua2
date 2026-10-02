package eus.adibidea;

public class Untxia extends Animalia{
    public Untxia (String izena, int adina, double pisua){
        super (izena,adina,pisua);
        setEspeziea("Untxia");
    }

    @Override
    public void eginSoinua(){
        System.out.println("grrrr");
    }

}
