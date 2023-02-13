package Mlo;
import java.util.Scanner;



public class SystimaAthina {

    public static void main(String args[]){
        String k;
        int counter;
        String LogedAm;
        Logariasmos LogedLogariasmos;

        Foititis foitites[] = new Foititis[10];
        foitites[0] = new Foititis("am1131","112233");
        foitites[1] = new Foititis("am2131","212233");
        foitites[2] = new Foititis("am3131","312233");
        foitites[3] = new Foititis("am4131","412233");
        foitites[4] = new Foititis("am5131","512233");

        Logariasmos logariasmoi[] = new Logariasmos[10];
        logariasmoi[0] = new Logariasmos(foitites[0],"Nikos_Kaladas","mail1@mail.com","6912345678");
        logariasmoi[1] = new Logariasmos(foitites[1],"Giwrgos_Tasos","mail2@mail.com","6922345678");
        logariasmoi[2] = new Logariasmos(foitites[2],"Vaggelis_Markou","mail3@mail.com","6932345678");
        logariasmoi[3] = new Logariasmos(foitites[3],"Lefterhs_Nikolaou","mail4@mail.com","6942345678");
        logariasmoi[4] = new Logariasmos(foitites[4],"Nikos_Eleftheriou","mail5@mail.com","6952345678");

        System.out.println("Epilexte energeia \n");

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1: Syndesh\n2: Egrafh\n3: Exodos");
            System.out.println("Epilogh: ");
            k= input.next();

            //edw xekinane oi elegxoi gia tis epiloges 1/2/3/diaforetika emfanish mnmatos lathos epiloghs

            //epilogh 1 SYNDESH
            if(k.equals("1")){
                boolean found=false;
                //oso to found einai false tha prospathei na kanei eisagwgh stoixeiwn kai an dwthei san am to exit tote tha ginetai exodos
                String tam=null;
                String tpwd;
                 counter=0;
                do {
                    System.out.println("Eisagete to am sas\n");
                    tam = input.next();

                    // an to tam einai diaforetiko apo exit tote xekinaei o elegxos

                        System.out.println("Eisagete to Password sas\n");
                        tpwd = input.next();

                        //anazhthsh se olous tous foitites gia to am kai pwd pou dwsame
                        for (int i = 0; i < 5; i++) {
                            counter++;
                            if (foitites[i].getAm().equals(tam) && foitites[i].getPwd().equals(tpwd)) {
                                System.out.println("2");
                                found = true;
                                LogedLogariasmos = logariasmoi[i];


                            }
                        }

                }while(found==false || counter==5 );

            }
            //epilogh 2 EGRAFH
            else if(k.equals("2")){

                System.out.println("Parakalw eisagete ta parakatw toixeia");

            }
            //epilogh 3 EXODOS
            else if(k.equals("3")) {
                System.out.println("Exodos!!");
            }else
            {
                System.out.println("Diathesimes Epiloges 1,2,3");
            }



            //telos elegxwn epiloghs

        }while(!(k.equals("3")));







    }
}
