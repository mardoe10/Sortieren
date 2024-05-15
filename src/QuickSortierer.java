import java.util.ArrayList;
import java.util.List;

public class QuickSortierer extends Sortierer{
    
    //Konstruktor der Elternklasse aufrufen
    public QuickSortierer(ArrayList<Integer> list){
        super(list);
    }

    //Implementierung der abstrakten Methode aus der Elternklasse Sortierer
    @Override
    public List<Integer> sortiere(List<Integer> list) {

        list = this.quicksort(list);
        return list;
    }

    //Methode quicksort
    public List<Integer> quicksort(List<Integer> list) {
        List<Integer> ersteListe = new ArrayList<>();
        List<Integer> zweiteListe = new ArrayList<>();
        List<Integer> sortierteListe = new ArrayList<>();

        int pivot;
      
            

        if (list.size() <= 1) {
            return list;
        } else {
            
            pivot = list.get(0);
            /*schleife die die Werte einteilt in die ertseLisste mit Elementen die kleiner als der pivot Wert sind
            in die zweiteListe kommen alle Werte die größer als der pivot Wert sind*/
            for(int i = 1; i < list.size(); i++) {
                if (list.get(i) < pivot) {
                    ersteListe.add(list.get(i));
                } else {
                    zweiteListe.add(list.get(i));
                }
            }
            
            sortierteListe.addAll(this.quicksort(ersteListe)); //hier wird die Methode rekursiv aufgerufen
            sortierteListe.add(pivot);
            sortierteListe.addAll(this.quicksort(zweiteListe)); //hier wird die Methode rekursiv aufgerufen

            return sortierteListe;
        }
    }

    
   
}
