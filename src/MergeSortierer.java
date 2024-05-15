import java.util.ArrayList;
import java.util.List;

public class MergeSortierer extends Sortierer{

    //Konstruktor der Elternklasse aufrufen
    public MergeSortierer(ArrayList<Integer> list){
        super(list);
    }

    //Implementierung der abstrakten Methode aus der Elternklasse Sortierer
    @Override
    public List<Integer> sortiere(List<Integer> list) {
        return list;
    }

}
