package Mlo;

public class Logariasmos {
    private Foititis foititis;
    private String onomatep,email,am,pwd;
    private String kin;

    public Logariasmos(Foititis foititis, String onomatep, String email, String kin) {
        this.foititis = foititis;
        this.onomatep = onomatep;
        this.email = email;
        this.am = foititis.getAm();
        this.pwd = foititis.getPwd();
        this.kin = kin;
    }




    public String getOnomatep() {
        return onomatep;
    }

    public void setOnomatep(String onomatep) {
        this.onomatep = onomatep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getKin() {
        return kin;
    }

    public void setKin(String kin) {
        this.kin = kin;
    }

    @Override
    public String toString() {
        return "Logariasmos{" +
                "onomatep='" + onomatep + '\'' +
                ", email='" + email + '\'' +
                ", am='" + am + '\'' +
                ", pwd='" + pwd + '\'' +
                ", kin='" + kin + '\'' +
                '}';
    }
}
