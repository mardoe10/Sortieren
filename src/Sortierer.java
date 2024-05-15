import java.util.ArrayList;
import java.util.List;

abstract class Sortierer {

    //Liste list mit Integer Werten
    protected List<Integer> list;


    //zwei Vriablen vom Typ int für Messungen
    protected long startZeit;
    protected long endZeit;


    //Konstrukto kopiert Liste mit ArrayList Konstruktor
    public Sortierer(List<Integer> list) {
        this.list = new ArrayList<>(list);
    }

    //abstrakte Methode sortiere mit Integer Liste als Parameter und selben RÜckgabewert
    protected abstract List<Integer> sortiere(List<Integer> list);


    // 2te Methode sortierer ohne Parameter aber mit Liste als Rückgabewert
    public List<Integer> sortiere(){
        //Vor dem sortieren wird die Startzeit gemessen
        startZeiMessung();

        //Die Methode sortiere wird aufgerufen
        list = sortiere(list);

        //Nach dem sortieren wird die Endzeit gemessen
        endZeitMessung();
        return list;
    } 

    
    //Rechnet die Zeitdifferenz zwischen Start und Endzeit und gibt diese zurück
    public long getOperations(){
        return endZeit - startZeit;
    }
    
    //Setzt die Startzeit gleich mit der System Zeit
    protected void startZeiMessung(){
        startZeit = System.currentTimeMillis();
    }

    //Setzt die Endzeit gleich mit der System Zeit
    protected void endZeitMessung(){
        endZeit = System.currentTimeMillis();
    }
}
