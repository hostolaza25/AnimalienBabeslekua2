package eus.adibidea;

public abstract class Animalia {

    private boolean adoptatua;
    private int adina;
    private double pisua;
    private String izena;
    private String espeziea;

    public Animalia (String izena, int adina, double pisua){
        this.izena = izena;
        this.adina = adina;
        this.pisua = pisua;
        this.adoptatua = false;

    }

    //get eta set

    public boolean isAdoptatua() {
        return adoptatua;
    }

    public void setAdoptatua(boolean adoptatua) {
        this.adoptatua = adoptatua;
    }

    public String getEspeziea() {
        return espeziea;
    }

    public void setEspeziea(String espeziea) {
        this.espeziea = espeziea;
    }

    public int getAdina() {
        return adina;
    }

    public void setAdina(int adina) {
        this.adina = adina;
    }

    public double getPisua() {
        return pisua;
    }

    public void setPisua(double pisua) {
        this.pisua = pisua;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }
// metodoak
    @Override
    public String toString() {
        return ("Animaliaren izena: " + izena + ", adina: " + adina + ", pisua: "+pisua);
    }

    public void eginSoinua(){

    }
}

