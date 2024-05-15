import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        /********************************************************************************************************************
       ***************************   Hier wird die Liste mit 500 random Werten angelegt    **********************************
       *********************************************************************************************************************/
        
        //Erzeuge eine ArrayListe mit 500 zufälligen Integer Werten im Bereich zwischen 1900 und 2013 mit der Math.random Methode
        List<Integer> jahreListe = new ArrayList<Integer>();

        
        for (int i = 0; i < 500; i++) {
            jahreListe.add((int) (Math.random() *(2013 - 1900 +1) + 1900));
        }



        /********************************************************************************************************************
       ***************************   Hier wird die Ursprungs Liste ausgegeben    ********************************************
       *********************************************************************************************************************/

        System.out.println("Unsortierte Liste: ");

        //Ausgabe der unsortierten Liste
        Ausgabe.liste(jahreListe);

        //Aufrufen der Methode insertSort aus der Klasse Ausgabe
        Ausgabe.insertSort();


        /********************************************************************************************************************
       *************   Hier wird sortiere der Klasse InsertSortierer angewendet und die Zeit ausgegeben    ******************
       *********************************************************************************************************************/

        //Erstellen eines Objektes der Klasse InsertSortierer
        Sortierer insertSortierer = new InsertSortierer((ArrayList<Integer>) jahreListe);
        List<Integer> sortierteListe = insertSortierer.sortiere();
        
        //Aufrufen der Methode sortiere aus der Klasse InsertSortierer
        Ausgabe.liste((ArrayList<Integer>) sortierteListe);
        
        //Ausgabe der Zeit von sortiere
        Ausgabe.zeit(insertSortierer.getOperations());
        System.out.println("\n");

       
       
       /********************************************************************************************************************
       **************   Hier wird quicksort der Klasse QuickSortierer angewendet und die Zeit ausgegeben    ****************
       *********************************************************************************************************************/
       
        //Erstellen eines Objektes der Klasse QuickSortierer
        Sortierer quickSortierer = new QuickSortierer((ArrayList<Integer>) jahreListe);
        List<Integer> sortierteListe2 = quickSortierer.sortiere();

        //Aufrufen der Methode sortiere aus der Klasse QuickSortierer
        Ausgabe.liste((ArrayList<Integer>) sortierteListe2);
     
        //Ausgabeder Zeit von quicksort
        Ausgabe.zeit(insertSortierer.getOperations());
        System.out.println("\n");

    
    
    }
}    
