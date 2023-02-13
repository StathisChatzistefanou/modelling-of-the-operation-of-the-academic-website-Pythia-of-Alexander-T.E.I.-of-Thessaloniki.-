package Mlo;

public class Programma {
    private Mathima[] mathimata= new Mathima[10];

    public Programma(Mathima[] mathimata) {
        this.mathimata = mathimata;
    }


    public void emfanishProgrammatos(){
        for (int i = 0; i < mathimata.length; i++) {
            System.out.println(mathimata[i].toString());
        }
    }
}
