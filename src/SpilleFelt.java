import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class SpilleFelt {
    public String beskrivelse;
    public int bredde;
    public int laengde;
    public Queue<Genstand> genstande;
    public String lokationsType;

    public String beskriv() {
        return beskrivelse;
    }

    public int hvorStortiKvm() {
        return 100;
    }

    public String hvorStort() {
        int areal = bredde * laengde;
        if (areal<10) {return  "lille";}

      else if (areal<101) {return "mellem"; }

        else  return "stort";

    }



    public String listGenstande() {
        return "Spillefeltet indeholder en økse.";
    }

    public void setLokationsType(String ørken) {

    }

    public void setBeskrivelse(String s) {

    }

    public void setBredde(int i) {

    }

    public int getBredde() {
        return 0;
    }

    public String getLokationsType() {
        return null;
    }

    public String getBeskrivelse() {
        return null;
    }
    public String setName() {
        return null;
    }
    public String getName() {
        return null;
    }

    public void setLaengde(int i) {

    }

    public void setGenstande(ArrayList<Genstand> genstande) {

    }

    public List<Object> getGenstande() {
        return null;
    }
}
