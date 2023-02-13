package Mlo;

public class Foititis {
    private String am,pwd;

    public Foititis(String am, String pwd) {
        this.am = am;
        this.pwd = pwd;
    }


    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Foititis{" +
                "am='" + am + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
