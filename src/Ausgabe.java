//import java.util.ArrayList;
import java.util.List;

public class Ausgabe {

    //Methode liste gibt Elemente einer als Parameter übergebenen Liste auf der Konsole aus mit je 30 Elementen in einer Zeile
    public static void liste(List<Integer> jahreListe) {
        for (int i = 0; i < jahreListe.size(); i++) {
            System.out.print(jahreListe.get(i) + " ");
            if ((i + 1) % 25 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }


    //Die Methoden mergeSort, quickSort und insertSort geben kurz Info welche ortierverfahren benutzt werden
    public static void mergeSort() {
       System.out.println("MergeSort wird benutzt");
    }
    
    public static void quickSort() {
        System.out.println("QuickSort wird benutzt");
    }

    public static void insertSort() {
        System.out.println("InsertSort wird benutzt");
    }
    //Methode zeit erwartet ein long als Parameter der die Rechenzeit in Millisekunden ausgibt
    public static void zeit(long zeit) {
        System.out.println("Die Rechenzeit beträgt: " + zeit + " Millisekunden");
    }

}
