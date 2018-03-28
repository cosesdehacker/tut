import javax.swing.JOptionPane;

public class tutorialATS {

    public static void main(String[] args) {

        String cadena;
        int entero = 3;
        double decimal;
        char letra;

        cadena = JOptionPane.showInputDialog("Escriu alguna cosa");
        entero += Integer.parseInt(JOptionPane.showInputDialog("Escriu un número"));
        //com que he posat += , em donarà el valor del int entero (3) + el valor del que introdueixi l'usuari
        entero += 5; // equivalent a entero = entero + 5
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Escriu un número decimal"));
        letra = JOptionPane.showInputDialog("Escriu alguna cosa").charAt(2);

        JOptionPane.showMessageDialog(null,"La cadena és "+cadena);
        JOptionPane.showMessageDialog(null, "El número sencer és "+entero);
        JOptionPane.showMessageDialog(null, "El número decimal és "+decimal);
        JOptionPane.showMessageDialog(null, "La lletra és "+letra);

        int x = 5;
        int y;

        y = x++; // l'increment ++ s'executa DESPRÉS de fer l'assignació x = y, per tant y = 5 i x = 6
        y = ++x; // l'increment ++ s'executa ABANS de l'assignació, per tant y = 6 i x = 6


    }

}
