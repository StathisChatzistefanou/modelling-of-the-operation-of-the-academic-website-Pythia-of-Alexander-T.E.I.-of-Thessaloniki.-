package Mlo;

public class Mathima {
    private String name,mera,wra;
    private int kwdPro;

    public Mathima(String name, String mera, String wra, int kwdPro) {
        this.name = name;
        this.mera = mera;
        this.wra = wra;
        this.kwdPro = kwdPro;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mathima{" +
                "name='" + name + '\'' +
                ", mera='" + mera + '\'' +
                ", wra='" + wra + '\'' +
                ", kwdikos proapaitoumenou=" + kwdPro +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMera() {
        return mera;
    }

    public void setMera(String mera) {
        this.mera = mera;
    }

    public String getWra() {
        return wra;
    }

    public void setWra(String wra) {
        this.wra = wra;
    }

    public int getKwdPro() {
        return kwdPro;
    }

    public void setKwdPro(int kwdPro) {
        this.kwdPro = kwdPro;
    }
}
