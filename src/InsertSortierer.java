import java.util.ArrayList;
import java.util.List;

public class InsertSortierer extends Sortierer{

   //Konstruktor der Elternklasse aufrufen
    public InsertSortierer(ArrayList<Integer> list){
        super(list);
    }



   //Implementierung der abstrakten Methode aus der Elternklasse Sortierer
        @Override
          
        public List<Integer> sortiere(List<Integer> list) {

            //Kopieren der Liste
            List<Integer> sortierteListe = new ArrayList<>(list);

            for (int i = 0; i < sortierteListe.size(); i++) {
                int groeßer = sortierteListe.get(i); //Speichert das Element wenn es größer ist
                int j = i - 1;
                  
                    //Verschieben der Elemente nach rechts wenn das Element größer als das in groeßer gespeichert ist
                    while (j >= 0 && sortierteListe.get(j) > groeßer) {                          
                        sortierteListe.set(j + 1, sortierteListe.get(j)); //verschiebt die Elemente nach rechts
                        j--; //geht einen Schritt nach links
                    }
                    sortierteListe.set(j + 1, groeßer); //fügt das Element an der richtigen Stelle ein
            }
            return sortierteListe;
        }

}
