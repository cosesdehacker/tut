package exerciciSobrecarregaMetodes;

//parlem de sobrecarrega de mètodes quan tenim dos mètodes (constructors o no) amb el mateix nom. No pot haver-ne
//dos que siguin EXACTAMENT iguals. Aquí hi ha exemples de com varien i de com això afecta a la invocació del
//mètode des del main després

public class SobrecarregaMetodesMain {

    public static void main(String[] args) {

        //estic cridant el constructor2 i el mètode1
        SobrecarregaMetodes HeBerenat = new SobrecarregaMetodes(3, "groc", "àcid");
        HeBerenat.fruita();

        //estic cridant el constructor1 i el mètode 2
        SobrecarregaMetodes HeComprat = new SobrecarregaMetodes("verd");
        HeComprat.fruita(9.2);

        //estic cridant el constructor3 i el mètode2 // Indica el color null perquè no hi ha argument
        SobrecarregaMetodes HeCompratAlMercat = new SobrecarregaMetodes();
        HeCompratAlMercat.fruita(2.1);

    }
}
